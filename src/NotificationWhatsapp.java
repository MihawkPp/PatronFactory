public class NotificationWhatsapp implements Notification {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("=== NOTIFICACIÓN POR WHATSAPP ===");
        System.out.println("Contacto: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("✓ WhatsApp enviado exitosamente\n");
    }
}
