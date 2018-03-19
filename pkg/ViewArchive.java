package pkg;

import java.util.Scanner;
import org.fusesource.jansi.*;

public class ViewArchive implements MenuStructure{

	private int mainSelection, intSelection, extSelection;
	private Scanner scanIn = new Scanner(System.in);
	private String date_received;

	public ViewArchive(){}

	public void mainmenu(){
		System.out.println("=====SISTEM PENGARSIPAN SURAT=====\n");
		System.out.println("1. Surat Masuk\n");
		System.out.println("2. Surat Keluar\n");
		System.out.println("3. Keluar\n");
		System.out.println("Masukkan pilihan menu: ");
		
		this.mainSelection = this.scanIn.nextInt();
		// this.scanIn.close();

		if(this.mainSelection == 1){
			this.internal();
		}
		else if(this.mainSelection == 2){
			this.external();
		}
		else if(this.mainSelection == 3){
			System.exit(0);
		}
		else{
			System.out.println("Menu tidak ada");
		}
	}

	public void internal(){

		this.clearScreen();

		System.out.println("=====SURAT MASUK=====\n");
		System.out.println("1. Buat Arsip Surat Masuk\n");
		System.out.println("2. Daftar Arsip Surat Masuk\n");
		System.out.println("3. Kembali ke Menu Utama\n");

		System.out.println("Masukkan pilihan menu: ");
		this.intSelection = this.scanIn.nextInt();
		// this.scanIn.close();

		if(this.intSelection == 1){
			this.clearScreen();
			this.createInternal();
		}
		else if(this.intSelection == 2){
			this.clearScreen();
			this.listInternal();
		}
		else if(this.intSelection == 3){
			this.clearScreen();
			this.mainmenu();
		}
		else{
			System.out.println("Menu tidak ada");
		}
	}

	public void createInternal(){
		this.clearScreen();
		System.out.println("=====Buat Arsip Surat Masuk=====\n\n");
		System.out.println("Masukkan data surat masuk\n\n");
		
		// System.out.println("Tanggal diterima: ");
		// this.date_received = this.scanIn.nextLine();

	}

	public void listInternal(){
		System.out.println("=====Daftar Arsip Surat Masuk=====\n\n");
	}

	public void external(){

		this.clearScreen();

		System.out.println("=====SURAT KELUAR=====\n");
		System.out.println("1. Buat Arsip Surat Keluar\n");
		System.out.println("2. Daftar Arsip Surat Keluar\n");
		System.out.println("3. Kembali ke Menu Utama\n");

		System.out.println("Masukkan pilihan menu: ");
		this.extSelection = this.scanIn.nextInt();
		// this.scanIn.close();

		if(this.extSelection == 1){
			this.clearScreen();
			this.createExternal();
		}
		else if(this.extSelection == 2){
			this.clearScreen();
			this.listExternal();
		}
		else if(this.extSelection == 3){
			this.clearScreen();
			this.mainmenu();
		}
		else{
			System.out.println("Menu tidak ada");
		}
	}

	public void createExternal(){
		System.out.println("=====Buat Arsip Keluar=====\n\n");
	}

	public void listExternal(){
		System.out.println("=====Daftar Arsip Surat Keluar=====\n\n");
	}

	public void clearScreen(){
		AnsiConsole.systemInstall();
    	Ansi ansi=Ansi.ansi();
        
       System.out.println(ansi.eraseScreen());
       //AnsiConsole.out.println(ansi.bg(Ansi.Color.RED) + "Hello");
	}
}
