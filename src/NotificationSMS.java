public class NotificationSMS implements Notification {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("=== NOTIFICACIÓN POR SMS ===");
        System.out.println("Número: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("✓ SMS enviado exitosamente\n");
    }
    
}
