public class NotificationEmail implements Notification {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("=== NOTIFICACIÓN POR EMAIL ===");
        System.out.println("Para: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("✓ Email enviado exitosamente\n");
    }
    
}
