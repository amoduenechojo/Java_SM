public abstract class Hook {
    public final void play() {
        initialize();
        startPlay();


        if (isAnnouncerRequired()){
            announceScore();
        }

        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

//
    boolean isAnnouncerRequired() {
        return false;
    }

    void announceScore() {
        System.out.println("ANNOUNCER: The current score is 0-0!");
    }
}