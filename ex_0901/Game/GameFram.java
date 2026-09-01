package Game;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Game.btnUI.Gbtn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;

public class GameFram extends JFrame{

    private int widt = 0;
    private int heig = 0;
    private char[][] bord;
    private Gbtn[][] bttns;

    ArrayList<JButton> btnArr;

    public GameFram(int widt, int heig){

        int hwidt = widt;
        int hheig = 50;
        
        this.widt = widt;
        this.heig = heig + hheig;
        this.bord = GlobalState.bord;
        this.bttns = GlobalState.bttns;
        
        setSize(this.widt, this.heig);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel mainP = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //헤더세팅
        JPanel header = setHeader(hwidt,hheig,gbc);
        mainP.add(header, gbc);
        
        //헤더에 게임시간 표시 창,
        GridBagConstraints hgbc = new GridBagConstraints();
        Font timeFont = new Font("맑은고딕", Font.BOLD, 30);
        Label timeLb = new Label("T");
        timeLb.setFont(timeFont);
        hgbc.gridx = 0;
        hgbc.gridy = 0;
        hgbc.weightx = 0.0;
        hgbc.weighty = 0;
        hgbc.fill = GridBagConstraints.HORIZONTAL;
        header.add(timeLb, hgbc);
        //초기화
        JButton setBtn = new JButton("초기화");
        setBtn.setSize(new Dimension(100,100));
        hgbc.gridx = 1;
        header.add(setBtn, hgbc);
        //남은 지뢰수
        Label minesLeft = new Label("남은지뢰");
        hgbc.gridx = 2;
        header.add(minesLeft, hgbc);

        //바디세팅
        JPanel jp = setBody(gbc);
        mainP.add(jp, gbc);

        add(mainP);
        setVisible(true);
    }
    void setFrame(){
        
    }

    public JPanel setHeader(int hwidt, int hheig, GridBagConstraints gbc){
        JPanel header = new JPanel(new GridBagLayout());
        header.setBackground(Color.CYAN);
        header.setPreferredSize(new Dimension(hwidt,hheig));
        header.setMinimumSize(new Dimension(hwidt,hheig));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        return header;
    }

    public JPanel setBody(GridBagConstraints gbc){
        JPanel jp = new JPanel(new GridLayout(10,10));
        jp.setPreferredSize(new Dimension(widt, heig)); // 타일 영역 기본 크기 지정
        bttns = new Gbtn[10][10];
        GlobalState.bttns = bttns; // GlobalState에도 새 배열 참조 연결

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                bttns[i][j] = new Gbtn(i, j, bord[i][j],bttns);
                //pn.setBackground(new Color(r,g,b));
                jp.add(bttns[i][j]);
            }
        }

        // 보드 패널용 GridBagConstraints 설정
        gbc.gridx = 0;
        gbc.gridy = 1; //아래 행으로 이동
        gbc.weightx = 1.0;
        gbc.weighty = 1.0; //남는 화면 공간을 모두 차지
        gbc.fill = GridBagConstraints.BOTH; // 상하좌우를 꽉 채우도록 설정

        return jp;
    }
}
