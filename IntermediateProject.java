import com.sun.deploy.security.SelectableSecurityManager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IntermediateProject {
    public static void main(String[] args)
    {
Business();
    }

        public static void Kurs(){

            Scanner scan = new Scanner(System.in);
            String kurs;
            int jumUSD,jumYen, jumEuro;

            System.out.println(" Pilihan Kurs ");
            System.out.println(" USD ");
            System.out.println(" Yen ");
            System.out.println(" Euro ");
            System.out.print(" Masukkan Pilihan Kurs Anda : ");
            kurs = scan.nextLine();

            kurs.toLowerCase().equals("usd");
            kurs.toLowerCase().equals("yen");
            kurs.toLowerCase().equals("euro");

            if(kurs.equals("usd")){
                System.out.println("Kurs USD ke IDR saat ini : 1 USD = RP. 14000");
                System.out.println("--------------------------------------------");
                System.out.print("Jumlah USD yang ingin dibeli : ");
                jumUSD = scan.nextInt();
                System.out.println("Harga Pembelian Kurs Dalam Rupiah = RP." + jumUSD*14000);
            }
            else
                if(kurs.equals("yen")){
                    System.out.println("Kurs Yen ke IDR saat ini : 1 Yen = RP. 1000");
                    System.out.println("--------------------------------------------");
                    System.out.print("Jumlah Yen yang ingin dibeli : ");
                    jumYen = scan.nextInt();
                    System.out.println("Harga Pembelian Kurs Dalam Rupiah = RP." + jumYen*1000);
                }
                else
                    if(kurs.equals("euro")){
                        System.out.println("Kurs Euro ke IDR saat ini : 1 Euro = RP. 18000");
                        System.out.println("--------------------------------------------");
                        System.out.print("Jumlah Euro yang ingin dibeli : ");
                        jumEuro = scan.nextInt();
                        System.out.println("Harga Pembelian Kurs Dalam Rupiah = RP." + jumEuro*18000);
                    }
                    else
                        System.out.println(" Invalid Kurs ");



    }

    public static void Business(){
            String bisnis;
            int pekerja, gaji, tanggal;
            int a,transfer, nominal;
            String norek[];
            String norek1;

            Scanner scan = new Scanner(System.in);
            System.out.println(" Pilihan Transaksi Untuk Akun Bisnis ");
            System.out.println(" Payroll ");
            System.out.println(" Transfer ");
            System.out.println("--------------------------------------");
            System.out.print("Pilihan : ");
            bisnis = scan.nextLine();

            if (bisnis.toLowerCase().equals("payroll")){
                System.out.println(" Berikut Sistem Pembayaran Gaji Bulanan");
                System.out.print(" Jumlah Pekerja : ");
                pekerja = scan.nextInt();
                System.out.print(" Nominal Gaji Bulanan : RP. ");
                gaji = scan.nextInt();
                System.out.print(" Tanggal Gaji Bulanan ");
                tanggal = scan.nextInt();
                System.out.println(" Masukkan Daftar No Rekening Pekerja ");
                norek= new String[pekerja];
                Scanner rekening = new Scanner(System.in);
                for (a=0; a<pekerja; a++){
                    System.out.print(" No Rekening : ");
                    norek1 = rekening.nextLine();
                    norek[a] = norek1;

                }
                System.out.println(" Mutasi Payroll ");
                for(a=0; a<pekerja; a ++){
                    System.out.println(norek[a] + " akan mendapatkan RP." + gaji + " setiap tanggal " + tanggal);
                }
            }
            else
                if (bisnis.toLowerCase().equals("transfer")){
                System.out.println("Limit Transfer Per Harian : 10 Transaksi");
                System.out.print(" Masukkan Nomor Rekening Transaksi : ");
                transfer = scan.nextInt();
                System.out.print(" Nominal Transaksi : ");
                nominal = scan.nextInt();
                System.out.println(" Otorisasi Transaksi ");
                System.out.println(" ");
                System.out.println(" Apakah Anda ");
            }
            else
                System.out.println(" Invalid Input ");


    }

}




