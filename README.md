
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi katalog data bacaan komik manhua favorit. Aplikasi ini dibuat menggunakan bahasa pemrograman **Java** sebagai tugas akhir dari mata kuliah **Pemrograman Berbasis Objek 1**.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk menginput beberapa data manhua seperti **judul, penulis, genre, status baca, dan chapter terakhir dibaca**, kemudian akan menampilkannya dalam format terstruktur.

Program ini dirancang untuk menerapkan 14 konsep OOP (Object-Oriented Programming) seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism (Overriding dan Overloading), Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

---

## Penjelasan Kode

Berikut adalah rincian penerapan konsep-konsep OOP dalam kode:

### 1. Class

Kelas adalah blueprint atau cetakan untuk membuat objek.
Dalam program ini terdapat 3 kelas utama yaitu `Manhua` `DetailManhua` dan `MainApp`

```java
public class Manhua { ... }
public class DetailManhua extends Manhua { ... }
public class MainApp { ... }
```

### 2. Object

Objek adalah instance dari class.

Object dibuat dari class `DetailManhua` dan disimpan dalam array:

```java
koleksi[i] = new DetailManhua(...);
```

### 3. Atribut

Atribut disimpan dalam class `Manhua` dan `DetailManhua`, disini:

```java
private String judul;
private String penulis;
private String genre;
private String statusBaca;
private int chapter;
```

### 4. Constructor

Digunakan untuk menginisialisasi nilai saat object dibuat, disini constructor menerima 3 parameter yaitu judul, penulis, dan genre

```java
public Manhua(String judul, String penulis, String genre) {
    this.judul = judul;
    this.penulis = penulis;
    this.genre = genre;
}
```

### 5. Mutator(Setter)

Digunakan untuk mengubah nilai atribut, disini yang bertipe void dan method dengan set diikuti dengan atribut(punya parameter)

```java
public void setStatusBaca(String statusBaca) { this.statusBaca = statusBaca; }
public void setChapter(int chapter) { this.chapter = chapter; }
```

### 6. Accessor(Getter)

Digunakan untuk membaca nilai atribut, tidak diawali dengan void, diawali dengan get----(tidak punya parameter)

```java
public String getStatusBaca() { return statusBaca; }
public int getChapter() { return chapter; }
```

### 7. Encapsulation

Encapsulation menyembunyikan detail data agar hanya bisa diakses lewat method.
Semua atribut dibuat private, lalu harus akses melalui getter dan setter.

```java
private String judul;
private int chapter;
```

### 8. Inheritance

sebuah class dapat mewarisi properti (atribut) dan method dari class lain.

`DetailManhua` mewarisi Manhua dengan extends, jadi pewarisan dilakukan dengan keyword extends.

```java
public class DetailManhua extends Manhua { ... }
```

### 9. Polymorphism

Polimorfisme memungkinkan method yang sama berperilaku berbeda,

Override(menimpa): Method tampilkanInfo() di `DetailManhua` menimpa method di `Manhua`.
Overload(kelebihan parameter): Method tampilkanInfo(String user) adalah versi berbeda dengan parameter tambahan.

```java
@Override
public String tampilkanInfo() { ... }

@overload
public String tampilkanInfo(String user) {
    return "Data oleh " + user + "\n" + tampilkanInfo();
}
```

### 10. Seleksi

Seleksi adalah struktur kontrol dalam pemrograman yang digunakan untuk mengambil keputusan berdasarkan kondisi tertentu.
Dalam Java umumnya dilakukan menggunakan if, if-else, if-else-if, switch, disini saya menggunakan if

```java
if (!status.equalsIgnoreCase("Ongoing") && !status.equalsIgnoreCase("Completed")) {
                    throw new IllegalArgumentException("Status harus 'Ongoing' atau 'Completed'");
                }
```

### 11. Perulangan

Perulangan (looping) adalah struktur kontrol yang digunakan untuk menjalankan blok kode secara berulang selama kondisi tertentu terpenuhi.

disini saya menggunakan for

```java
for (DetailManhua m : koleksi) {
                System.out.println(m.tampilkanInfo("Al-Fadilah Nur Sahdan Al-Biya"));
                System.out.println("----------------------");
            }
```

### 12. IO Sederhana

Menggunakan Scanner untuk input dan System.out.print untuk output:

```java
Scanner input = new Scanner(System.in);
```

### 13. Array

Data manhua disimpan dalam array:

```java
DetailManhua[] koleksi = new DetailManhua[2];
```

### 14. Error Handling

Error handling adalah teknik dalam pemrograman untuk menangani kesalahan (error) yang mungkin terjadi saat program berjalan (runtime).

disini try berisi blok kode yang berisiko error, seperti konversi string ke angka, akses array, dsb.

pada bagian catch(---) Blok ini akan menangkap dan menangani kesalahan jika terjadi NumberFormatException, yaitu kesalahan saat mencoba mengubah teks menjadi angka tapi inputnya tidak valid (misalnya huruf)

```java
try {
    ...
} catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }

```

---

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

---

## Pembuat

- **Nama**: Al-Fadilah Nur Sahdan Al-Biya  
- **NPM**: 2310010465  
- **Kelas**: 4C_PBO1
