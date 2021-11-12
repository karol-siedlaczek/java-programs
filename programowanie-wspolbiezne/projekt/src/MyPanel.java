import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;

public class MyPanel extends JPanel{
	static Kolejka urzad_krzak=new Kolejka();
	static int ile_klientow=30;
	static int id_kolejnego_klienta=0;
	static int tempoOdswierzania=21;
	JButton przyciskDodajKlienta = new JButton("Dodaj klienta");
	JButton przyciskZwiekszTempo = new JButton("+");
	JButton przyciskZmniejszTempo = new JButton("-");


	public MyPanel() {
		PoruszajaceSieObiekty.urzad=urzad_krzak;
		PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty =new ArrayList<>();
		setPreferredSize(new Dimension(900, 700));
		add(przyciskDodajKlienta);
		add(przyciskZwiekszTempo);
		add(przyciskZmniejszTempo);
		przyciskDodajKlienta.addActionListener(this::wcisnietyprzyciskDodajKlienta);
		przyciskZwiekszTempo.addActionListener(this::wcisnietyprzyciskZwiekszTempo);
		przyciskZmniejszTempo.addActionListener(this::wcisnietyprzyciskZmniejszTempo);
		przyciskDodajKlienta.setBounds(700,630,150,50);
		przyciskZmniejszTempo.setBounds(600,630,50,50);
		przyciskZwiekszTempo.setBounds(600,730,50,50);
		przyciskDodajKlienta.setVisible(true);
		przyciskZwiekszTempo.setVisible(true);
		przyciskZmniejszTempo.setVisible(true);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		//Kolory
		Color jasna_pomarancza = new Color(234, 162, 72);
		Color ciemna_pomarancza = new Color(165, 116, 50);
		Color jasno_brazowy = new Color(82, 49, 23);
		Color ciemno_brazowy = new Color(50, 31, 18);

		// Sala
		g.setColor(ciemna_pomarancza);
		g.fillRoundRect( 350, 0, 200, 100, 20, 20);
		g.fillRoundRect( 5, 85, 880, 350, 20, 20);
		g.fillRoundRect( 400, 420, 100, 100, 20, 20);
		g.fillRoundRect( 10, 500, 880, 100, 20, 20);
		g.setColor(jasna_pomarancza);
		g.fillRoundRect( 355, 5, 195, 95, 20, 20);
		g.fillRoundRect( 10, 90, 875, 345, 20, 20);
		g.fillRoundRect( 405, 425, 95, 95, 20, 20);
		g.fillRoundRect( 15, 505, 875, 95, 20, 20);

		//Elementy
		g.setColor(ciemno_brazowy);
		g.fillRect( 385, 10, 130, 30);
		g.fillRect( 50, 215, 100, 60);
		g.fillRect( 283, 215, 100, 60);
		g.fillRect( 516, 215, 100, 60);
		g.fillRect( 745, 215, 100, 60);
		g.setColor(jasno_brazowy);
		g.fillRect( 390, 15, 130, 30);
		g.fillRect( 55, 220, 100, 60);
		g.fillRect( 288, 220, 100, 60);
		g.fillRect( 521, 220, 100, 60);
		g.fillRect( 750, 220, 100, 60);
		/////////////////////////////////////////////////////
		//Nowi klienci

		if(ile_klientow>0 && (PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.size()==0
				|| PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.get
				(PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.size()-1).getX()>40)){
			PoruszajaceSieObiekty nowy_klient = new PoruszajaceSieObiekty(id_kolejnego_klienta,10);
			PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.add(nowy_klient);
			nowy_klient.start();
			id_kolejnego_klienta++;
			ile_klientow--;
		}

		//Ruch obiektow i ich usuwanie klientow
		for(int i = 0; i< PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.size(); i++){
			if(PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.get(i).getX()==900){
				PoruszajaceSieObiekty.czy_zajeta_lista.dodanieDoKolejki(1);
				PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.remove(PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.get(i));
				PoruszajaceSieObiekty.czy_zajeta_lista.zwolnieniePrzejscia(1);
			}else {
				g.setColor(Color.BLACK);
				g.drawString(String.valueOf(PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.get(i).getid()),
						PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.get(i).getX(),
						PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.get(i).getY());
				g.setColor(ciemno_brazowy);
				g.fillOval(PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.get(i).getX(),
						PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.get(i).getY(),30,30);
			}
		}
		try{
			Thread.sleep(tempoOdswierzania);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/////////////////////////////////////////////////////
		g.setColor(ciemno_brazowy);
		g.fillRect( 5, 510, 20, 80);
		g.fillRect( 875, 510, 20, 80);

		//Napisy
		g.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		g.setColor(Color.WHITE);
		g.drawString("Kawa",425,30);
		g.drawString("Stolik 1",65,240);
		g.drawString("Stolik 2",298,240);
		g.drawString("Stolik 3",531,240);
		g.drawString("Stolik 4",764,240);
		g.setColor(ciemno_brazowy);
		g.drawString("We",7,620);
		g.drawString("Wy",870,620);
		g.drawString("Sala 1",15,75);
		g.drawString("Korytarz",330,470);
		g.drawString("Sala 2",15,490);

		//Stopka
		g.drawString("Oddany podatek:",15,650);
		g.drawString(String.valueOf(Worki.skarbiec),60,680);
		g.drawString("Ilosc klientow:",170,650);
		if(PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.size()>4)
			g.drawString(String.valueOf(PoruszajaceSieObiekty.wszyscy_poruszajaceSieObiekty.size()-4),350,650);
		else
			g.drawString("0",350,650);
		g.drawString("Ilosc oczekujacych:",170,680);
		g.drawString(String.valueOf(ile_klientow),350,680);

		g.drawString("Aktualne tempo",420,650);
		g.drawString(String.valueOf(PoruszajaceSieObiekty.tempoPracy),460,680);
		przyciskDodajKlienta.setBounds(700,630,150,50);
		przyciskZwiekszTempo.setBounds(580,630,50,50);
		przyciskZmniejszTempo.setBounds(640,630,50,50);

		repaint();
	}
	public void wcisnietyprzyciskDodajKlienta(ActionEvent e){
		ile_klientow++;
	}
	public void wcisnietyprzyciskZwiekszTempo(ActionEvent e){
		if(PoruszajaceSieObiekty.tempoPracy>1)PoruszajaceSieObiekty.tempoPracy--;
		tempoOdswierzania=16+PoruszajaceSieObiekty.tempoPracy;
	}
	public void wcisnietyprzyciskZmniejszTempo(ActionEvent e){
		PoruszajaceSieObiekty.tempoPracy++;
		tempoOdswierzania=16+PoruszajaceSieObiekty.tempoPracy;
	}
}