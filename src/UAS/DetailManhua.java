package UAS;

public class DetailManhua extends Manhua {
    private String statusBaca;
    private int chapter;

    public DetailManhua(String judul, String penulis, String genre, String statusBaca, int chapter) {
        super(judul, penulis, genre);
        this.statusBaca = statusBaca;
        this.chapter = chapter;
    }

    public String getStatusBaca() { return statusBaca; }
    public void setStatusBaca(String statusBaca) { this.statusBaca = statusBaca; }

    public int getChapter() { return chapter; }
    public void setChapter(int chapter) { this.chapter = chapter; }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
               "\nStatus: " + statusBaca +
               "\nChapter Terakhir Dibaca: " + chapter;
    }

     public String tampilkanInfo(String user) {
        return "Data oleh " + user + "\n" + tampilkanInfo();
    }
}

   


    
    

   

    


    
