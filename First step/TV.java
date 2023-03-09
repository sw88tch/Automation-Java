public class TV {
        private static int tvCounter;           // obyavlyaem peremennyu-schetchik
        private int diagonal;

        public TV(int diagonal) {
            this.diagonal = diagonal;
            tvCounter++;            // +1 kogda ispolzuetsya construktor
        }
}
