public class Artist {
    public void paint() {
        System.out.println("Ya risuyu");
    }
}

class Pointillist extends Artist {
    @Override
        public void paint() {
            System.out.println("Ya risuyu tochkami");
    }
}

class Impressionist extends Artist {
    @Override
    public void paint() {
        System.out.println("Ya peredayu vpechatleniya");
    }
}

class Cubist extends Artist {
    @Override
    public void paint() {
        System.out.println("Ya ispolzuyu prostye geometr formy");
    }
}
