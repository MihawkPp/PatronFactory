public class LauncherPatronFactory {
    public static void main(String[] args) throws Exception {
        NotificationSystem sistema = new NotificationSystem();

        System.out.println("Actividad Patron Factory\n");

        sistema.enviarNotificacion("EMAIL", "usuario@ejemplo.com",
                "Bienvenido a la actividad del lunes");

        sistema.enviarNotificacion("SMS", "+57 300 123 4567",
                "Tu código esta muy bien hecho :D");

        sistema.enviarNotificacion("WHATSAPP", "Juan Pérez",
                "Ejemplo de mensje 3 :O");

        // Probamos un tipo de notificcion invlido
        sistema.enviarNotificacion("TELEGRAM", "usuario123",
                "Este tipo no existe");
    }
}
