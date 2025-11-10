public class NotificationSystem {
    
    public void enviarNotificacion(String tipo, String destinatario, String mensaje) {
        // Usamos el Factory para crear la notificación
        Notification notificacion = NotificationFactory.crearNotificacion(tipo);
        
        if (notificacion != null) {
            notificacion.enviar(destinatario, mensaje);
        }
    }
}