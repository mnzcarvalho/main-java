package exercicios.review.c.test;

import exercicios.review.c.domain.*;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("=== Sistemas de notificação ===");
        Notificavel email = new EmailNotificacao("cliente@gmail.com");
        Notificavel sms = new SMSNotificacao("(81) 99999-9999");
        NotificacaoUrgente urgente= new NotificacaoUrgente("gerente@empresa.com", "todos", 9);

        System.out.println("=== Enviando notificações regulares ===");
        email.enviarNotificacao("Seu pedido foi processado com sucesso");
        sms.enviarNotificacao("Sua consulta foi agendada para amanhã às 14h.");

        System.out.println("=== Notificação URGENTE ===");
        urgente.enviarNotificacao("Falha crítica no sistema! Ação imediata necessária.");

        //usando a interface Priorizavel
        System.out.println("=== Verificando prioridades ===");
        System.out.println("Prioridade da notificação: " + urgente.getPrioridade());
        System.out.println("É alta prioridade? " + urgente.isAltaPrioridade());


        // Demonstração de polimorfismo com Notificavel
        System.out.println("\n=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        Notificavel[] notificacoes = {
                new EmailNotificacao("time@empresa.com"),
                new SMSNotificacao("(11) 98888-8888"),
                new NotificacaoUrgente("admin@empresa.com", "email", 7)
        };

        for (Notificavel notificacao : notificacoes) {
            System.out.println("\nProcessando notificação do tipo: " + notificacao.getClass().getSimpleName());
            notificacao.enviarNotificacao("Mensagem de teste do sistema.");


            // Verificar se é Priorizavel
            if (notificacao instanceof Priorizavel) {
                Priorizavel prioritario = (Priorizavel) notificacao;
                System.out.println("Prioridade: " + prioritario.getPrioridade());
            }
        }
    }
}
