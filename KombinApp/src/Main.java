import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Pantolon pantolon = new Pantolon();
        Esofman esofman = new Esofman();
        Tshirt tshirt = new Tshirt();
        Sweat sweat = new Sweat();
        Gomlek gomlek = new Gomlek();
        CasualAyakkabi casualAyakkabi = new CasualAyakkabi();
        SporAyakkabi sporAyakkabi = new SporAyakkabi();//Nenelerim burada
                

        JFrame jframe = new JFrame("Kombin Application");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400, 400);//Jframe Burada


        //Anamenu tasarım start
        JPanel anamenu = new JPanel();
        anamenu.setSize(400, 400);
        JLabel lblKiyafet, lblrenk;

        lblrenk = new JLabel("Renk Seçiniz");
        lblrenk.setBounds(10, 60, 150, 30);
        lblrenk.setFont(new Font("Calibri", Font.BOLD, 16));

        lblKiyafet = new JLabel("Ürünün Türünü Girin");
        lblKiyafet.setBounds(10, 30, 150, 30);
        lblKiyafet.setFont(new Font("Calibri", Font.BOLD, 16));

        String[] kiyafetler = {"Casual Ayakkabı", "Spor Ayakkabı", "Gömlek", "Sweat", "Tshirt", "Pantolon", "Eşofman",};//kullanıcıdan seçmesini istediğimiz
        JComboBox cboxKiyafet = new JComboBox(kiyafetler);                                                              //türleri hazırladık
        cboxKiyafet.setBounds(170, 40, 150, 20);

        String[] renkler = {"Beyaz", "Siyah", "Lacivert", "Haki", "Kahverengi", "Mavi", "Gri", "Bordo","Krem","Hardal"}; //Kullanıcadan Seçmesini istediğimiz
        JComboBox cboxRenk = new JComboBox(renkler);                                                      //renk seçeneklerini hazırladık
        cboxRenk.setBounds(170, 70, 150, 20);

        JButton btn = new JButton("Kombin Getir");
        btn.setBounds(220, 200, 150, 30);

        JButton btn2 = new JButton("Kendimi şanslı hissediyorum");
        btn2.setBounds(10, 200, 200, 30);


        anamenu.setLayout(null);
        anamenu.add(lblKiyafet);
        anamenu.add(cboxKiyafet);
        anamenu.add(lblrenk);
        anamenu.add(cboxRenk);
        anamenu.add(btn);
        anamenu.add(btn2);
        //Anamenu Tasarımı End

        //Kombin Sayfası Tasarımı Başlangıç
        JPanel kombinPage = new JPanel();
        kombinPage.setLayout(null);
        kombinPage.setSize(400, 400);

        JLabel gelengiyim, gelenrenk, kbn1, kbn2, kbn3, kbn12, kbn22, kbn32, gelenrenk2, gelengiyim2;

        gelengiyim = new JLabel();
        gelengiyim.setBounds(170,20,170,30);
        gelengiyim.setFont(new Font("Calibri", Font.BOLD, 20));

        gelenrenk = new JLabel();
        gelenrenk.setBounds(100,20,100,30);
        gelenrenk.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn1 = new JLabel();
        kbn1.setBounds(100,60,200,30);
        kbn1.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn2 = new JLabel();
        kbn2.setBounds(100,100,200,30);
        kbn2.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn3 = new JLabel();
        kbn3.setBounds(100,140,160,30);
        kbn3.setFont(new Font("Calibri", Font.BOLD, 20));

        JButton tektarDene,asayfaget;
        tektarDene = new JButton("Tekrar Kombin Getir");
        tektarDene.setBounds(100,250,200,30);

        asayfaget = new JButton("Anasayfaya Dön");
        asayfaget.setBounds(100,300,200,30);

        kombinPage.add(asayfaget);
        kombinPage.add(tektarDene);

        kombinPage.add(kbn1);
        kombinPage.add(gelenrenk);
        kombinPage.add(gelengiyim);
        kombinPage.add(kbn2);
        kombinPage.add(kbn3);

        kombinPage.setVisible(false);
        // Kombin sayfası Tasarımı Bitiş


        //Kombin sayfası tasarımı 2
        JPanel kombinPage2 = new JPanel();
        kombinPage2.setLayout(null);
        kombinPage2.setSize(400, 400);

        gelengiyim2 = new JLabel();
        gelengiyim2.setBounds(170,20,170,30);
        gelengiyim2.setFont(new Font("Calibri", Font.BOLD, 20));

        gelenrenk2 = new JLabel();
        gelenrenk2.setBounds(100,20,100,30);
        gelenrenk2.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn12 = new JLabel();
        kbn12.setBounds(100,60,200,30);
        kbn12.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn22 = new JLabel();
        kbn22.setBounds(100,100,200,30);
        kbn22.setFont(new Font("Calibri", Font.BOLD, 20));

        kbn32 = new JLabel();
        kbn32.setBounds(100,140,160,30);
        kbn32.setFont(new Font("Calibri", Font.BOLD, 20));

        JButton tektarDene2,asayfaget2;
        tektarDene2 = new JButton("Yenile");
        tektarDene2.setBounds(100,250,200,30);

        asayfaget2 = new JButton("Anasayfaya Dön");
        asayfaget2.setBounds(100,300,200,30);

        kombinPage2.add(asayfaget2);
        kombinPage2.add(tektarDene2);

        kombinPage2.add(gelenrenk2);
        kombinPage2.add(gelengiyim2);
        kombinPage2.add(kbn12);
        kombinPage2.add(kbn22);
        kombinPage2.add(kbn32);

        kombinPage2.setVisible(false);
        //Kombin sayfası tasarımı 2 bitiş

        asayfaget.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                anamenu.setVisible(true);
                kombinPage.setVisible(false);
            }
        }); //Anasayfaya geri dönme metodunun işlev kazandığı bölüm


        btn.addActionListener(new ActionListener() {//Bu metod kullanıcı butona bastığı zaman kullanıcın girdiği veriler kullanılarak oluşturduğumuz
            @Override                                 // nesneler kullanılarak uygun kombinler üretilir.
            public void actionPerformed(ActionEvent e) {
                String renk = (String)cboxRenk.getSelectedItem();
                String giyim = (String) cboxKiyafet.getSelectedItem();

                if(giyim == "Pantolon"){
                    kbn3.setText( pantolon.aksesuarGetir());
                    kbn1.setText( pantolon.ustlukGetir(renk) );
                    kbn2.setText( pantolon.AyakkabiGetir(renk) );
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                }

                else if (giyim == "Eşofman") {
                    kbn3.setText(esofman.aksesuarGetir());
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                    kbn1.setText(esofman.ustlukGetir(renk));
                    kbn2.setText(esofman.AyakkabiGetir(renk));
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    kbn3.setText(sweat.aksesuarGetir());
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                    String altlik = sweat.altlikGetir(renk);
                    kbn1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");

                    if(sayi<0)
                        kbn2.setText(pantolon.AyakkabiGetir(renk));
                    else
                        kbn2.setText(esofman.AyakkabiGetir(renk));
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    kbn3.setText(tshirt.aksesuarGetir());
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                    String altlik = tshirt.altlikGetir(renk);
                    kbn1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn2.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        kbn2.setText( esofman.AyakkabiGetir(renk) );
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    kbn3.setText(gomlek.aksesuarGetir());
                    gelenrenk.setText(renk);
                    gelengiyim.setText(giyim);
                    kbn1.setText( gomlek.altlikGetir(renk) );
                    kbn2.setText( gomlek.ayakkabiGetir(renk) );
                }  // Gömlek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    kbn3.setText(casualAyakkabi.aksesuarGetir());
                    gelenrenk.setText(renk );
                    gelengiyim.setText( giyim );
                    kbn2.setText( casualAyakkabi.altlikGetir(renk) );
                    kbn1.setText( casualAyakkabi.ustlukGetir(renk));
                } // Casual Ayakkabı seçilirse
                else{
                    kbn3.setText(sporAyakkabi.aksesuarGetir());
                    gelenrenk.setText(renk );
                    gelengiyim.setText( giyim);
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    kbn2.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        kbn1.setText(pantolon.ustlukGetir(renk));
                    else
                        kbn1.setText(esofman.ustlukGetir(renk));
                }//Spor ayakkabı seçilirse
                anamenu.setVisible(false);
                kombinPage.setVisible(true);
            }
        });
        tektarDene.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String renk = gelenrenk.getText();
                String giyim = gelengiyim.getText();
                if(giyim == "Pantolon"){
                    kbn3.setText( pantolon.aksesuarGetir());
                    kbn1.setText( pantolon.ustlukGetir(renk) );
                    kbn2.setText( pantolon.AyakkabiGetir(renk) );
                }
                else if (giyim == "Eşofman") {
                    kbn3.setText(esofman.aksesuarGetir());
                    kbn1.setText(esofman.ustlukGetir(renk));
                    kbn2.setText(esofman.AyakkabiGetir(renk));
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    kbn3.setText(sweat.aksesuarGetir());
                    String altlik = sweat.altlikGetir(renk);
                    kbn1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn2.setText(pantolon.AyakkabiGetir(renk));
                    else
                        kbn2.setText(esofman.AyakkabiGetir(renk));
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    kbn3.setText(tshirt.aksesuarGetir());
                    String altlik = tshirt.altlikGetir(renk);
                    kbn1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn2.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        kbn2.setText( esofman.AyakkabiGetir(renk) );
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    kbn3.setText(gomlek.aksesuarGetir());
                    kbn1.setText( gomlek.altlikGetir(renk) );
                    kbn2.setText( gomlek.ayakkabiGetir(renk) );
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    kbn3.setText(casualAyakkabi.aksesuarGetir());
                    kbn2.setText( casualAyakkabi.altlikGetir(renk) );
                    kbn1.setText( casualAyakkabi.ustlukGetir(renk));
                } // Casual Ayakkabı seçilirse
                else{
                    kbn3.setText(sporAyakkabi.aksesuarGetir());
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    kbn2.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                       kbn1.setText(pantolon.ustlukGetir(renk));
                    else
                        kbn1.setText(esofman.ustlukGetir(renk));
                }//Spor ayakkabı seçilirse
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                String renk = gelenrenk2.getText();
                String giyim = gelengiyim2.getText();
                int random = r.nextInt(7);
                int random2 = r.nextInt(10);

                switch (random2){
                    case 0:
                        renk = "Beyaz";
                        break;
                    case 1:
                        renk = "Siyah";
                        break;
                    case 2:
                        renk = "Lacivert";
                        break;
                    case 3:
                        renk = "Haki";
                        break;
                    case 4:
                        renk = "Kahverengi";
                        break;
                    case 5:
                        renk = "Mavi";
                        break;
                    case 6:
                        renk = "Gri";
                        break;
                    case 7:
                        renk = "Bordo";
                        break;
                    case 8:
                        renk = "Krem";
                        break;
                    case 9:
                        renk = "Hardal";
                        break;
                    default:
                        renk = "Beyaz";
                        break;
                }

                switch (random){  //Rastgele kıyafet
                    case 0:
                        giyim = "Tshirt";
                        break;
                    case 1:
                        giyim = "Pantolon";
                        break;
                    case 2:
                        giyim = "Eşofman";
                        break;
                    case 3:
                        giyim = "Sweat";
                        break;
                    case 4:
                        giyim = "Casual Ayakkabı";
                        break;
                    case 5:
                        giyim = "Gömlek";
                        break;
                    case 6:
                        giyim = "Spor Ayakkabı";
                        break;
                    default:
                        giyim="Tshirt";
                        break;
                }
                if(giyim == "Pantolon"){
                    kbn32.setText( pantolon.aksesuarGetir());
                    kbn12.setText( pantolon.ustlukGetir(renk) );
                    kbn22.setText( pantolon.AyakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }
                else if (giyim == "Eşofman") {
                    kbn32.setText(esofman.aksesuarGetir());
                    kbn12.setText(esofman.ustlukGetir(renk));
                    kbn22.setText(esofman.AyakkabiGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    kbn32.setText(sweat.aksesuarGetir());
                    String altlik = sweat.altlikGetir(renk);
                    kbn12.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn22.setText(pantolon.AyakkabiGetir(renk));
                    else
                        kbn22.setText(esofman.AyakkabiGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    kbn32.setText(tshirt.aksesuarGetir());
                    String altlik = tshirt.altlikGetir(renk);
                    kbn12.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn22.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        kbn22.setText( esofman.AyakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    kbn32.setText(gomlek.aksesuarGetir());
                    kbn12.setText( gomlek.altlikGetir(renk) );
                    kbn22.setText( gomlek.ayakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    kbn32.setText(casualAyakkabi.aksesuarGetir());
                    kbn22.setText( casualAyakkabi.altlikGetir(renk) );
                    kbn12.setText( casualAyakkabi.ustlukGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } // Casual Ayakkabı seçilirse
                else{
                    kbn32.setText(sporAyakkabi.aksesuarGetir());
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    kbn22.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        kbn12.setText(pantolon.ustlukGetir(renk));
                    else
                        kbn12.setText(esofman.ustlukGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }//Spor ayakkabı seçilirse

                anamenu.setVisible(false);
                kombinPage2.setVisible(true);

            }

});
        tektarDene2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                String renk = gelenrenk2.getText();
                String giyim = gelengiyim2.getText();
                int random = r.nextInt(7);
                int random2 = r.nextInt(10);

                switch (random2){
                    case 0:
                        renk = "Beyaz";
                        break;
                    case 1:
                        renk = "Siyah";
                        break;
                    case 2:
                        renk = "Lacivert";
                        break;
                    case 3:
                        renk = "Haki";
                        break;
                    case 4:
                        renk = "Kahverengi";
                        break;
                    case 5:
                        renk = "Mavi";
                        break;
                    case 6:
                        renk = "Gri";
                        break;
                    case 7:
                        renk = "Bordo";
                        break;
                    case 8:
                        renk = "Krem";
                        break;
                    case 9:
                        renk = "Hardal";
                        break;
                    default:
                        renk = "Beyaz";
                        break;
                }

                switch (random){  //Rastgele kıyafet
                    case 0:
                        giyim = "Tshirt";
                        break;
                    case 1:
                        giyim = "Pantolon";
                        break;
                    case 2:
                        giyim = "Eşofman";
                        break;
                    case 3:
                        giyim = "Sweat";
                        break;
                    case 4:
                        giyim = "Casual Ayakkabı";
                        break;
                    case 5:
                        giyim = "Gömlek";
                        break;
                    case 6:
                        giyim = "Spor Ayakkabı";
                        break;
                    default:
                        giyim="Tshirt";
                        break;
                }
                if(giyim == "Pantolon"){
                    kbn32.setText( pantolon.aksesuarGetir());
                    kbn12.setText( pantolon.ustlukGetir(renk) );
                    kbn22.setText( pantolon.AyakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }
                else if (giyim == "Eşofman") {
                    kbn32.setText(esofman.aksesuarGetir());
                    kbn12.setText(esofman.ustlukGetir(renk));
                    kbn22.setText(esofman.AyakkabiGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    kbn32.setText(sweat.aksesuarGetir());
                    String altlik = sweat.altlikGetir(renk);
                    kbn12.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn22.setText(pantolon.AyakkabiGetir(renk));
                    else
                        kbn22.setText(esofman.AyakkabiGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    kbn32.setText(tshirt.aksesuarGetir());
                    String altlik = tshirt.altlikGetir(renk);
                    kbn12.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        kbn22.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        kbn22.setText( esofman.AyakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    kbn32.setText(gomlek.aksesuarGetir());
                    kbn12.setText( gomlek.altlikGetir(renk) );
                    kbn22.setText( gomlek.ayakkabiGetir(renk) );
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    kbn32.setText(casualAyakkabi.aksesuarGetir());
                    kbn22.setText( casualAyakkabi.altlikGetir(renk) );
                    kbn12.setText( casualAyakkabi.ustlukGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                } // Casual Ayakkabı seçilirse
                else{
                    kbn32.setText(sporAyakkabi.aksesuarGetir());
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    kbn22.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        kbn12.setText(pantolon.ustlukGetir(renk));
                    else
                        kbn12.setText(esofman.ustlukGetir(renk));
                    gelenrenk2.setText(renk);
                    gelengiyim2.setText(giyim);
                }//Spor ayakkabı seçilirse
            }
        });

        asayfaget2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                anamenu.setVisible(true);
                kombinPage2.setVisible(false);
            }});

        jframe.add(kombinPage2);
        jframe.add(kombinPage);
        jframe.add(anamenu);
        jframe.setVisible(true);
    }
}

