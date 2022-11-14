public class Main {
    public static void main(String[] args) {
        ObjetoTransportable primerSilla = new ObjetoTransportable(
                "primera silla",
                2.0,
                new Dimension(0.5, 1, 0.5)
        );
        ObjetoTransportable primerTelevisor = new ObjetoTransportable(
                "primer televisor",
                2.0,
                new Dimension(1.5, 1, 0.1)
        );

        MedioDeTransporte camionDeLosLunes = new MedioDeTransporte(
                500.0,
                new Dimension(3.0, 1.5, 6.0)
        );

    }
}
