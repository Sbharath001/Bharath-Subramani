package bharath;

class Volume extends Choose {
    static int sound = 50;

    public void volume_up() {
        if (sound <= 90) {
            sound = sound + 10;
            System.out.println("Volume increased by 10 = " + sound);
        } else {
            System.out.println("Maximum volume is 100");
        }
    }

    public void volume_down() {
        if (sound >= 10) {
            sound -= 10;
            System.out.println("Volume decreased by 10 = " + sound);
        } else {
            System.out.println("Volume is 0, no sound");
        }
    }
}
