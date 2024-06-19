public class Main {
    public static void main(String[] args) {
        MenuPengiriman menu = new MenuPengiriman();
        ControllerPengiriman controller = new ControllerPengiriman(menu);
        
        controller.prosesPengiriman();
    }
}
