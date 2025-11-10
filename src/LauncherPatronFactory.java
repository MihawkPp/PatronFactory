public class LauncherPatronFactory {
    public static void main(String[] args) throws Exception {
        NotificationSystem sistema = new NotificationSystem();
        
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE NOTIFICACIONES - FACTORY      ║");
        System.out.println("╚════════════════════════════════════════════╝\n");
        
        // Probando diferentes tipos de notificaciones
        sistema.enviarNotificacion("EMAIL", "usuario@example.com", 
            "Bienvenido a nuestra aplicación");
        
        sistema.enviarNotificacion("SMS", "+57 300 123 4567", 
            "Tu código de verificación es: 1234");
        
        sistema.enviarNotificacion("WHATSAPP", "Juan Pérez", 
            "Tu pedido ha sido enviado y llegará mañana");
        
        // Probando con tipo inválido
        sistema.enviarNotificacion("TELEGRAM", "usuario123", 
            "Este tipo no existe");
    }
}
