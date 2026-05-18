public class Football extends Hook {
        @Override
        void initialize() { System.out.println("Football: Setup pitch."); }

        @Override
        void startPlay() { System.out.println("Football: Match started!"); }

        @Override
        void endPlay() { System.out.println("Football: Match finished."); }

        // We "Hook" into the process here!
        @Override
        boolean isAnnouncerRequired() {
            return true;
        }
    }
}
