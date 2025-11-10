class NotificationFactory {
    
    // Método estático que crea las Notificationes según el tipo
    public static Notification crearNotificacion(String tipo) {
        switch (tipo.toUpperCase()) {
            case "EMAIL":
                return new NotificationEmail();
            case "SMS":
                return new NotificationSMS();
            case "WHATSAPP":
                return new NotificationWhatsapp();
            default:
                System.out.println("Tipo de notificación no válido: " + tipo);
                return null;
        }
    }
}