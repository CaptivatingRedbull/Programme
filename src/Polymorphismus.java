public class Polymorphismus {
    public static void main(String[] args) {
        Boot boot = new Boot();
        bootFahren(boot);

        SegelBoot segelBoot = new SegelBoot();
        bootFahren(segelBoot);

        MotorBoot motorBoot = new MotorBoot();
        bootFahren(motorBoot);
    }

    public static void bootFahren(Boot boot) {
        System.out.println(boot.fahren());
    }
}

class Motor {
}

class Mast {
}

class Segel {
}

class Schwimmkoerper {
}

class Boot {
    Schwimmkoerper schwimmKoerper;
    Boolean angelegt = true;

    public String fahren() {
        return ("Wir fahren übern See.");
    }

    public Boolean anlegen() {
        return angelegt = true;
    }

    public Boolean ablegen() {
        return angelegt = false;
    }

    public Boolean istAngelegt() {
        return angelegt;
    }


}

class SegelBoot extends Boot {
    Mast[] masts;
    Segel[] segel;

    @Override
    public String fahren() {
        return "Wir segeln übern See.";
    }
}

class MotorBoot extends Boot {
    Motor motor;

    @Override
    public String fahren() {
        return "Wir tuckern übern See.";
    }
}
