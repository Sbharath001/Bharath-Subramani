package bharath;

class Encapsulation {
    private String password;

    public String get_password() {  
        return password;
    }

    public void set_password() { 
        String new_password = "bharath@1234";  
        password = new String(new_password);
    }
}

class Username extends MusicPlayer {
    protected void id() {
        final String user_id = "Bharath S";  
        Encapsulation encap = new Encapsulation();
        System.out.println("Login in = " + user_id);
        encap.set_password();  
        System.out.println("Password = " + encap.get_password()); 
    }
}
