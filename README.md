# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi game rpg sederhana menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama , level dan job, dan memberikan output berupa pilihan aksi apa yang mau dilakukan oleh player.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphsm, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Karakter`, `Player`, `Enemy`, `GameRpg` dan `Main` adalah contoh dari class.

```bash
abstract class Karakter {
    ...
}

public class Player extends Karakter {
    ...
}

public class Enemy extends Karakter {
    ...
}

public class GameRpg {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `player = new Player(Name, level, job);` adalah contoh pembuatan object.

```bash
  player = new Player(Name, level, job);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `level` dan `job` adalah contoh atribut.

```bash
//Atribut di class Karakter
String nama;
int level;
int health;
int attackPower;
String job;

//Atribut di class Player
int experience;

//Atribut di class Enemy
int enemyLevel;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Karakter`, `Player` dan `Enemy`.

```bash
public Karakter(String nama, int level, String job) {
  this.nama = nama;
  this.level = level;
  this.job = job;
  this.health = 100;
  this.attackPower = 10;
}

public Player(String name, int level, String job) {
  super(name, level,job);
  this.experience = 0;
}

 public Enemy(String name, int level, int enemyLevel) {
  super(name, level , "Enemy");
  this.enemyLevel = enemyLevel;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setLevel` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setLevel(int level) {
    this.level = level;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getlevel` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getLevel() {
    return level;
}
```

7. **Encapsulation** adalah metode untuk mengatur struktur pada class dengan tujuan untuk menentukan hak akses pada property atau method. Pada kode ini, saya menggunakan enkapsulasi protected di atribut super class yaitu `nama`, `level`, `health`, `attackPower`, `job` dan private di atribut subclass yaitu `experience`, `enemyLevel`.

```bash
//SuperClass
protected String nama;
protected int level;
protected int health;
protected int attackPower;
protected String job;

//SubClass
private int experience;
private int enemyLevel;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Player` mewarisi `Karakter`, `Enemy` mewarisi `Karakter` dengan sintaks `extends`.

```bash
public class Player extends Karakter {
    ...
}

public class Enemy extends Karakter {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, merupakan override dari method `showCharacterStatus` di `Karakter` dan  `specialAbility` di Karakter.

```bash

@Override
public String showCharacterStatus() {
    ...
}

@Override
public String specialAbility() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `spesialAbiliy` yang ada di class `Player`, dan seleksi `switch` dalam class `GameRpg`.

```bash
public void specialAbility() {
  if (job.equalsIgnoreCase("Mage")) {
   System.out.println(nama + " menggunakan kemampuan khusus: Fireball!");
   System.out.println("Musuh terkena serangan Fireball dan menerima 20 poin kerusakan tambahan!");
   } else if (job.equalsIgnoreCase("Warrior")) {
      System.out.println(nama + " menggunakan kemampuan khusus: Power Strike!");
      System.out.println("Seranganmu lebih kuat dan musuh menerima 15 poin kerusakan tambahan!");
    }
}

 switch (choice) {
  case 1:
  ...
  break;

  case 2:
  player.levelUp();
  player.showCharacterStatus();
  break;
  case 3:
  player.specialAbility();
  break;
                
  case 4:
  player.showCharacterStatus();
  break;
                    
  case 5:
  System.out.println("Terima kasih telah bermain!");
  isPlaying = false;
  break;
  default:
  System.out.println("Pilihan tidak valid.");
  break;
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk pengulangan aksi yang mau dilakukan dan `for` untuk perulangan memanggil isi array.

```bash
 while (isPlaying) {
  ...
}

for (int i = 0; i < enemies.length; i++) {
 System.out.println((i + 1) + ". " + enemies[i]);
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Player: ");
String Name = scanner.nextLine();

System.out.print("Masukkan Level Awal Player: ");
int level = scanner.nextInt();
        
System.out.print("Masukkan Pekerjaan Player (Mage/Warrior): ");
String job = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `String[] enemies = {"Goblin", "Skeleton", "Orc", "Dragon"};` adalah contoh penggunaan array.

```bash
String[] enemies = {"Goblin", "Skeleton", "Orc", "Dragon"};
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
String enemyName = enemies[enemyChoice - 1];
Karakter enemy = new Enemy(enemyName, player.level, enemyChoice);
player.attackEnemy(enemyName);
enemy.attackEnemy(player.nama);
if(enemyChoice == 1){
player.gainExperience(25);
}else if(enemyChoice == 2){
player.gainExperience(50);
}else if(enemyChoice == 3){
player.gainExperience(75);
}else if(enemyChoice == 4){
player.gainExperience(100);
}
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Pilihan musuh tidak valid.");
}
```

## Usulan nilai

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

## Pembuat

Nama: Arif Budiman
NPM: 2110010361
Kelas: 4G Reguler Malam Banjarmasin
