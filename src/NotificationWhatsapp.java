public class NotificationWhatsapp implements Notification {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Notificación enviada vía WhatsApp");
        System.out.println("Contacto: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("WhatsApp enviado exitosamente\n");
    }
}
