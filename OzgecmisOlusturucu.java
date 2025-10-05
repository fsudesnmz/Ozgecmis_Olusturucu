import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.File;
import java.io.IOException;

public class OzgecmisOlusturucu {

    public static void main(String[] args) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            // Türkçe karakter destekli fontları proje ana dizininden yüklüyoruz.
            PDType0Font regularFont = PDType0Font.load(document, new File("arial.ttf"));
            PDType0Font boldFont = PDType0Font.load(document, new File("arialbd.ttf"));

            // Resim dosyasını proje ana dizininden yüklüyoruz.
            String imagePath = "profil.jpg";
            PDImageXObject pdImage = PDImageXObject.createFromFile(imagePath, document);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {

                // --- Profil Fotoğrafı ---
                contentStream.drawImage(pdImage, 450, 650, 100, 120);

                // --- Kişisel Bilgiler ---
                contentStream.beginText();
                contentStream.setFont(boldFont, 20);
                contentStream.newLineAtOffset(50, 750);
                contentStream.showText("Fatma Sude Sönmez");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(boldFont, 12);
                contentStream.newLineAtOffset(50, 735);
                contentStream.showText("Yazılım Mühendisi");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(regularFont, 11);
                contentStream.newLineAtOffset(50, 720);
                contentStream.showText("E-posta: sudesonmez@gmail.com");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(regularFont, 11);
                contentStream.newLineAtOffset(50, 705);
                contentStream.showText("Telefon: +90 555 123 45 67");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(regularFont, 11);
                contentStream.newLineAtOffset(50, 690);
                contentStream.showText("Adres: Karahıdır Mahallesi, Işık Sokak No:1 D:2, Kırklareli");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(regularFont, 11);
                contentStream.newLineAtOffset(50, 675);
                contentStream.showText("Doğum Tarihi: 05.01.2002");
                contentStream.endText();

                // --- Eğitim Bilgileri ---
                contentStream.beginText();
                contentStream.setFont(boldFont, 14);
                contentStream.newLineAtOffset(50, 640);
                contentStream.showText("Eğitim Bilgileri");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(boldFont, 12);
                contentStream.newLineAtOffset(50, 620);
                contentStream.showText("Kırklareli Üniversitesi - Yazılım Mühendisliği");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 605);
                contentStream.showText("Lisans - 2020 - 2024");
                contentStream.endText();

                // --- İş Deneyimi ---
                contentStream.beginText();
                contentStream.setFont(boldFont, 14);
                contentStream.newLineAtOffset(50, 570);
                contentStream.showText("İş Deneyimi");
                contentStream.endText();

                // 1. İş Deneyimi
                contentStream.beginText();
                contentStream.setFont(boldFont, 12);
                contentStream.newLineAtOffset(50, 550);
                contentStream.showText("Kıdemli Yazılım Geliştirici - Teknoloji A.Ş.");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 535);
                contentStream.showText("Ocak 2025 - Günümüz");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(65, 520);
                contentStream.showText("- Java ve Spring Boot kullanılarak yüksek performanslı web servisleri geliştirildi.");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(65, 505);
                contentStream.showText("- Proje mimarisinin tasarlanması ve mikroservis yapılarının oluşturulması.");
                contentStream.endText();

                // 2. İş Deneyimi
                contentStream.beginText();
                contentStream.setFont(boldFont, 12);
                contentStream.newLineAtOffset(50, 480);
                contentStream.showText("Yazılım Geliştirici - Bilişim Ltd. Şti.");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 465);
                contentStream.showText("Haziran 2023 - Ocak 2024");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(65, 450);
                contentStream.showText("- C# ve .NET teknolojileri ile masaüstü uygulamaları geliştirildi.");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(65, 435);
                contentStream.showText("- Mevcut projelerin bakım, güncelleme ve hata düzeltmeleri yapıldı.");
                contentStream.endText();

                // 3. İş Deneyimi
                contentStream.beginText();
                contentStream.setFont(boldFont, 12);
                contentStream.newLineAtOffset(50, 410);
                contentStream.showText("Stajyer Yazılım Geliştirici - Yazılım Çözümleri");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 395);
                contentStream.showText("Haziran 2021 - Ağustos 2021");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(65, 380);
                contentStream.showText("- Yazılım geliştirme ekibine destek verildi, test süreçlerine katılım sağlandı.");
                contentStream.endText();


                // --- Sertifikalar ---
                contentStream.beginText();
                contentStream.setFont(boldFont, 14);
                contentStream.newLineAtOffset(50, 350);
                contentStream.showText("Sertifikalar");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(boldFont, 12);
                contentStream.newLineAtOffset(50, 330);
                contentStream.showText("Oracle Certified Professional, Java SE 8 Programmer");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 315);
                contentStream.showText("Oracle - 2019");
                contentStream.endText();

                // --- Beceriler ve Diller ---
                contentStream.beginText();
                contentStream.setFont(boldFont, 14);
                contentStream.newLineAtOffset(50, 280);
                contentStream.showText("Beceriler");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 260);
                contentStream.showText("- Java, Spring Boot, C#, .NET, SQL, Git, Docker");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(boldFont, 14);
                contentStream.newLineAtOffset(300, 280);
                contentStream.showText("Bildiği Diller");
                contentStream.endText();

                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(300, 260);
                contentStream.showText("- İngilizce B2, Japonca A1");
                contentStream.endText();


                // --- Referanslar ---
                contentStream.beginText();
                contentStream.setFont(boldFont, 14);
                contentStream.newLineAtOffset(50, 220);
                contentStream.showText("Referanslar");
                contentStream.endText();

                // 1. Referans
                contentStream.beginText();
                contentStream.setFont(boldFont, 12);
                contentStream.newLineAtOffset(50, 200);
                contentStream.showText("Ahmet Çelik");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 185);
                contentStream.showText("Proje Yöneticisi, Teknoloji A.Ş. | ahmet.celik@email.com");
                contentStream.endText();

                // 2. Referans
                contentStream.beginText();
                contentStream.setFont(boldFont, 12);
                contentStream.newLineAtOffset(50, 160);
                contentStream.showText("Zeynep Kaya");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 145);
                contentStream.showText("İnsan Kaynakları Müdürü, Bilişim Ltd. Şti. | zeynep.kaya@email.com");
                contentStream.endText();

                // --- İlgi Alanları ---
                contentStream.beginText();
                contentStream.setFont(boldFont, 14);
                contentStream.newLineAtOffset(50, 110);
                contentStream.showText("İlgi Alanları");
                contentStream.endText();
                contentStream.beginText();
                contentStream.setFont(regularFont, 10);
                contentStream.newLineAtOffset(50, 90);
                contentStream.showText("Yapay Zeka, Mobil Uygulama Geliştirme, Kitap Okumak, Doğa Yürüyüşleri");
                contentStream.endText();
            }

            document.save("Ozgecmis.pdf");
            System.out.println("Özgeçmiş başarıyla oluşturuldu: Ozgecmis.pdf");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}