public class Ex2 {
    public static class Author {
        private String name, email;
        public Author(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return this.name;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {

        }

        public String toString() {
            return "Author[name=" + this.name + ", email="+this.email + "]" ;
        }
    }
    public static void main(String[] args) {
        Author a1 = new Author("Salah", "salah@test.com");
        System.out.println(a1.toString());

    }
}
