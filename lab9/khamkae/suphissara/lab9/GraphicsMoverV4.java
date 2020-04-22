public class GraphicsMoverV4 extends GraphicsMoverV3 {

    private static final long serialVersionUID = 1L;

    protected CanvasDrawerV2 canvasDrawerV2;  

    protected GraphicsMoverV4(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }
    
    protected void initComponents() {
        super.initComponents();
        canvasDrawerV2 = new CanvasDrawerV2();
        moveUpbutton.setText("Move Left Up");
        moveDownbutton.setText("Move Left Down");
        moveLeftbutton.setText("Move Right Up");
        moveRightbutton.setText("Move RIght Down");
    }

    protected void addComponents() {
        super.addComponents();
        newWindowpanel.remove(canvasDrawerV1);
        newWindow.add(canvasDrawerV2, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        GraphicsMoverV4 gpmvV4 = new GraphicsMoverV4("Graphics Mover Version 4");
        gpmvV4.initComponents();
        gpmvV4.addComponents();
        gpmvV4.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
