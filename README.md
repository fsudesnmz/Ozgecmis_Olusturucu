# Özgeçmiş Oluşturucu

Java ve Apache PDFBox kullanarak profesyonel bir özgeçmiş PDF'i oluşturan basit bir uygulama.

## Özellikler

- 📄 Profesyonel özgeçmiş PDF'i oluşturma
- 🖼️ Profil fotoğrafı desteği
- 🇹🇷 Türkçe karakter desteği
- 📝 Kapsamlı bölümler (Eğitim, İş Deneyimi, Sertifikalar, Beceriler vb.)
- 🎨 Düzenli ve okunabilir tasarım

## Gereksinimler

- Java 8 veya üzeri
- Apache PDFBox 2.x
- Arial font dosyaları (`arial.ttf` ve `arialbd.ttf`)
- Profil fotoğrafı (`profil.jpg`)

## Kurulum

### 1. Projeyi klonlayın

```bash
git clone https://github.com/kullaniciadi/ozgecmis-olusturucu.git
cd ozgecmis-olusturucu
```

### 2. Apache PDFBox bağımlılığını ekleyin

#### Yöntem 1: Maven kullanarak

**Maven** (`pom.xml`):

```xml
<dependencies>
    <dependency>
        <groupId>org.apache.pdfbox</groupId>
        <artifactId>pdfbox</artifactId>
        <version>2.0.29</version>
    </dependency>
</dependencies>
```

#### Yöntem 2: Gradle kullanarak

**Gradle** (`build.gradle`):

```gradle
dependencies {
    implementation 'org.apache.pdfbox:pdfbox:2.0.29'
}
```

#### Yöntem 3: Manuel JAR dosyası ekleme

Maven veya Gradle kullanmıyorsanız, JAR dosyalarını manuel olarak indirebilirsiniz:

1. **PDFBox ve bağımlılıklarını indirin:**
   - [Apache PDFBox İndirme Sayfası](https://pdfbox.apache.org/download.html)
   - Veya doğrudan Maven Repository'den:
     - [pdfbox-2.0.29.jar](https://repo1.maven.org/maven2/org/apache/pdfbox/pdfbox/2.0.29/pdfbox-2.0.29.jar)
     - [fontbox-2.0.29.jar](https://repo1.maven.org/maven2/org/apache/pdfbox/fontbox/2.0.29/fontbox-2.0.29.jar)
     - [commons-logging-1.2.jar](https://repo1.maven.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar)

2. **JAR dosyalarını projenize ekleyin:**
   
   Proje dizininizde bir `lib` klasörü oluşturun ve indirdiğiniz JAR dosyalarını buraya koyun:
   ```
   ozgecmis-olusturucu/
   ├── lib/
   │   ├── pdfbox-2.0.29.jar
   │   ├── fontbox-2.0.29.jar
   │   └── commons-logging-1.2.jar
   ├── OzgecmisOlusturucu.java
   ├── arial.ttf
   ├── arialbd.ttf
   └── profil.jpg
   ```

3. **Derleme ve çalıştırma:**
   
   **Windows:**
   ```bash
   javac -cp ".;lib/*" OzgecmisOlusturucu.java
   java -cp ".;lib/*" OzgecmisOlusturucu
   ```
   
   **Linux/Mac:**
   ```bash
   javac -cp ".:lib/*" OzgecmisOlusturucu.java
   java -cp ".:lib/*" OzgecmisOlusturucu
   ```

4. **IDE'de kullanım (IntelliJ IDEA / Eclipse):**
   
   **IntelliJ IDEA:**
   - File → Project Structure → Libraries
   - "+" işaretine tıklayın → Java
   - `lib` klasöründeki tüm JAR dosyalarını seçin
   - OK'e tıklayın
   
   **Eclipse:**
   - Projeye sağ tıklayın → Build Path → Configure Build Path
   - Libraries sekmesine gidin
   - Add JARs veya Add External JARs'a tıklayın
   - `lib` klasöründeki JAR dosyalarını seçin
   - Apply and Close

### 3. Gerekli dosyaları hazırlayın

Proje ana dizinine aşağıdaki dosyaları ekleyin:

- `arial.ttf` - Arial Regular font
- `arialbd.ttf` - Arial Bold font
- `profil.jpg` - Profil fotoğrafınız

## Kullanım

### Komut satırından çalıştırma

```bash
javac -cp ".;pdfbox-2.0.29.jar" OzgecmisOlusturucu.java
java -cp ".;pdfbox-2.0.29.jar" OzgecmisOlusturucu
```

**Not:** Linux/Mac için `;` yerine `:` kullanın.

### Maven ile çalıştırma

```bash
mvn compile exec:java -Dexec.mainClass="OzgecmisOlusturucu"
```

### IDE'den çalıştırma

`OzgecmisOlusturucu.java` dosyasını IDE'nizde açın ve çalıştırın.

## Çıktı

Program çalıştırıldığında proje dizininde `Ozgecmis.pdf` dosyası oluşturulur.

## Özgeçmiş Bölümleri

Oluşturulan özgeçmiş aşağıdaki bölümleri içerir:

- **Kişisel Bilgiler**: İsim, unvan, iletişim bilgileri, doğum tarihi
- **Profil Fotoğrafı**: Sağ üst köşede görüntülenir
- **Eğitim Bilgileri**: Üniversite ve mezuniyet bilgileri
- **İş Deneyimi**: Detaylı çalışma geçmişi
- **Sertifikalar**: Profesyonel sertifikalar
- **Beceriler**: Teknik yetenekler
- **Bildiği Diller**: Dil yetkinlikleri
- **Referanslar**: İş referansları
- **İlgi Alanları**: Kişisel ilgi alanları

## Özelleştirme

Kendi bilgilerinizi eklemek için `OzgecmisOlusturucu.java` dosyasındaki ilgili bölümleri düzenleyin:

```java
// Örnek: İsim değiştirme
contentStream.showText("Işıl Yılmaz"); // Kendi isminizi yazın

// Örnek: E-posta değiştirme
contentStream.showText("E-posta: isil.yilmaz@email.com"); // Kendi e-postanızı yazın
```

## Font Dosyalarını Bulma

Windows kullanıcıları için Arial fontları:
- `C:\Windows\Fonts\arial.ttf`
- `C:\Windows\Fonts\arialbd.ttf`

Bu dosyaları proje ana dizininize kopyalayın.

## Sorun Giderme

### "Font dosyası bulunamadı" hatası

Font dosyalarının proje ana dizininde olduğundan emin olun.

### "Resim dosyası bulunamadı" hatası

`profil.jpg` dosyasının proje ana dizininde olduğundan ve JPEG formatında olduğundan emin olun.

### Türkçe karakterler düzgün görünmüyor

Arial fontlarını kullandığınızdan ve `PDType0Font.load()` metoduyla yüklediğinizden emin olun.

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır.

---
