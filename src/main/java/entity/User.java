//package pl.clt;
package entity;

public class User {
    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }

    public String toString(){
        return "User{id:"+id+" login: "+login+" password:"+password;
    }

    public static class Cloth extends Product{
        private String size;
        private String material;
        public Cloth(int id, String productName, float price, float weight, String color, int productCount, String size, String materal){
            super(id, productName, price, weight, color, productCount);
            this.size = size;
            this.material = materal;
        }

        public String getSize() {
            return size;
        }

        public String getMaterial() {
            return material;
        }

        @Override
        public String toString() {
            String c = ", ";
            return super.toString()+"+Boots{"+size+c+material+"]";
        }

    }
}
