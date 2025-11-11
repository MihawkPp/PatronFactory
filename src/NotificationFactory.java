public class NotificationFactory {

    // Método estático que va clasificar las notificaciones como en el ejemplo de
    // las pizzas
    public static Notification crearNotificacion(String tipo) {
        switch (tipo.toUpperCase()) {
            case "EMAIL":
                return new NotificationEmail();
            case "SMS":
                return new NotificationSMS();
            case "WHATSAPP":
                return new NotificationWhatsapp();
            default:
                System.out.println("Tipo de notificación inválido: " + tipo);
                return null;
        }
    }
}