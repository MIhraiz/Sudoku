import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainWindow {

	private JFrame frame;
	private JTextField textField00;
	private JTextField textField10;
	private JTextField textField20;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_01;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField fields[][] = new JTextField[9][9];
	private JLabel lblMohammadIhraiz;
	private JLabel lblNewLabel;
	private int[][] startGrid = new int[9][9];
	private String startGridDif = "";
	JLabel lblDif=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.scrollbar);
		frame.setBounds(100, 100, 437, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSudokuSolver = new JLabel("Sudoku");
		lblSudokuSolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblSudokuSolver.setFont(new Font("Bungee Inline", Font.PLAIN, 18));
		lblSudokuSolver.setBounds(107, 11, 221, 37);
		frame.getContentPane().add(lblSudokuSolver);
		
		textField00 = new JTextField();
		textField00.setBackground(SystemColor.controlHighlight);
		textField00.setBounds(29, 59, 26, 27);
		fields[0][0] = textField00;
		frame.getContentPane().add(textField00);
		
		textField10 = new JTextField();
		textField10.setBackground(SystemColor.controlHighlight);
		textField10.setBounds(29, 86, 26, 27);
		frame.getContentPane().add(textField10);
		fields[1][0] = textField10;
		
		textField20 = new JTextField();
		textField20.setBackground(SystemColor.controlHighlight);
		textField20.setBounds(29, 113, 26, 27);
		frame.getContentPane().add(textField20);
		fields[2][0] = textField20;
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.activeCaption);
		textField_3.setBounds(29, 140, 26, 27);
		frame.getContentPane().add(textField_3);
		fields[3][0] = textField_3;
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.activeCaption);
		textField_4.setColumns(10);
		textField_4.setBounds(29, 167, 26, 27);
		frame.getContentPane().add(textField_4);
		fields[4][0] = textField_4;
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.activeCaption);
		textField_5.setColumns(10);
		textField_5.setBounds(29, 194, 26, 27);
		frame.getContentPane().add(textField_5);
		fields[5][0] = textField_5;
		
		textField_6 = new JTextField();
		textField_6.setBackground(SystemColor.controlHighlight);
		textField_6.setBounds(29, 221, 26, 27);
		frame.getContentPane().add(textField_6);
		fields[6][0] = textField_6;
		
		textField_7 = new JTextField();
		textField_7.setBackground(SystemColor.controlHighlight);
		textField_7.setBounds(29, 248, 26, 27);
		frame.getContentPane().add(textField_7);
		fields[7][0] = textField_7;
		
		textField_8 = new JTextField();
		textField_8.setBackground(SystemColor.controlHighlight);
		textField_8.setBounds(29, 275, 26, 27);
		frame.getContentPane().add(textField_8);
		fields[8][0] = textField_8;
		
		textField_01 = new JTextField();
		textField_01.setBackground(SystemColor.controlHighlight);
		textField_01.setBounds(55, 59, 26, 27);
		frame.getContentPane().add(textField_01);
		fields[0][1] = textField_01;
		
		textField_10 = new JTextField();
		textField_10.setBackground(SystemColor.controlHighlight);
		textField_10.setBounds(55, 86, 26, 27);
		frame.getContentPane().add(textField_10);
		fields[1][1] = textField_10;
		
		textField_11 = new JTextField();
		textField_11.setBackground(SystemColor.controlHighlight);
		textField_11.setBounds(55, 113, 26, 27);
		frame.getContentPane().add(textField_11);
		fields[2][1] = textField_11;
		
		textField_12 = new JTextField();
		textField_12.setBackground(SystemColor.activeCaption);
		textField_12.setBounds(55, 140, 26, 27);
		frame.getContentPane().add(textField_12);
		fields[3][1] = textField_12;
		
		textField_13 = new JTextField();
		textField_13.setBackground(SystemColor.activeCaption);
		textField_13.setColumns(10);
		textField_13.setBounds(55, 167, 26, 27);
		frame.getContentPane().add(textField_13);
		fields[4][1] = textField_13;
		
		textField_14 = new JTextField();
		textField_14.setBackground(SystemColor.activeCaption);
		textField_14.setColumns(10);
		textField_14.setBounds(55, 194, 26, 27);
		frame.getContentPane().add(textField_14);
		fields[5][1] = textField_14;
		
		textField_15 = new JTextField();
		textField_15.setBackground(SystemColor.controlHighlight);
		textField_15.setBounds(55, 221, 26, 27);
		frame.getContentPane().add(textField_15);
		fields[6][1] = textField_15;
		
		textField_16 = new JTextField();
		textField_16.setBackground(SystemColor.controlHighlight);
		textField_16.setBounds(55, 248, 26, 27);
		frame.getContentPane().add(textField_16);
		fields[7][1] = textField_16;
		
		textField_17 = new JTextField();
		textField_17.setBackground(SystemColor.controlHighlight);
		textField_17.setBounds(55, 275, 26, 27);
		frame.getContentPane().add(textField_17);
		fields[8][1] = textField_17;
		
		textField_18 = new JTextField();
		textField_18.setBackground(SystemColor.controlHighlight);
		textField_18.setBounds(81, 59, 26, 27);
		frame.getContentPane().add(textField_18);
		fields[0][2] = textField_18;
		
		textField_19 = new JTextField();
		textField_19.setBackground(SystemColor.controlHighlight);
		textField_19.setBounds(81, 86, 26, 27);
		frame.getContentPane().add(textField_19);
		fields[1][2] = textField_19;
		
		textField_20 = new JTextField();
		textField_20.setBackground(SystemColor.controlHighlight);
		textField_20.setBounds(81, 113, 26, 27);
		frame.getContentPane().add(textField_20);
		fields[2][2] = textField_20;
		
		textField_21 = new JTextField();
		textField_21.setBackground(SystemColor.activeCaption);
		textField_21.setBounds(81, 140, 26, 27);
		frame.getContentPane().add(textField_21);
		fields[3][2] = textField_21;
		
		textField_22 = new JTextField();
		textField_22.setBackground(SystemColor.activeCaption);
		textField_22.setColumns(10);
		textField_22.setBounds(81, 167, 26, 27);
		frame.getContentPane().add(textField_22);
		fields[4][2] = textField_22;
		
		textField_23 = new JTextField();
		textField_23.setBackground(SystemColor.activeCaption);
		textField_23.setColumns(10);
		textField_23.setBounds(81, 194, 26, 27);
		frame.getContentPane().add(textField_23);
		fields[5][2] = textField_23;
		
		textField_24 = new JTextField();
		textField_24.setBackground(SystemColor.controlHighlight);
		textField_24.setBounds(81, 221, 26, 27);
		frame.getContentPane().add(textField_24);
		fields[6][2] = textField_24;
		
		textField_25 = new JTextField();
		textField_25.setBackground(SystemColor.controlHighlight);
		textField_25.setBounds(81, 248, 26, 27);
		frame.getContentPane().add(textField_25);
		fields[7][2] = textField_25;
		
		textField_26 = new JTextField();
		textField_26.setBackground(SystemColor.controlHighlight);
		textField_26.setBounds(81, 275, 26, 27);
		frame.getContentPane().add(textField_26);
		fields[8][2] = textField_26;
		
		textField_27 = new JTextField();
		textField_27.setBackground(SystemColor.activeCaption);
		textField_27.setBounds(107, 59, 26, 27);
		frame.getContentPane().add(textField_27);
		fields[0][3] = textField_27;
		
		textField_28 = new JTextField();
		textField_28.setBackground(SystemColor.activeCaption);
		textField_28.setBounds(133, 59, 26, 27);
		frame.getContentPane().add(textField_28);
		fields[0][4] = textField_28;
		
		textField_29 = new JTextField();
		textField_29.setBackground(SystemColor.activeCaption);
		textField_29.setBounds(159, 59, 26, 27);
		frame.getContentPane().add(textField_29);
		fields[0][5] = textField_29;
		
		textField_30 = new JTextField();
		textField_30.setBackground(SystemColor.activeCaption);
		textField_30.setBounds(159, 86, 26, 27);
		frame.getContentPane().add(textField_30);
		fields[1][5] = textField_30;
		
		textField_31 = new JTextField();
		textField_31.setBackground(SystemColor.activeCaption);
		textField_31.setBounds(133, 86, 26, 27);
		frame.getContentPane().add(textField_31);
		fields[1][4] = textField_31;
		
		textField_32 = new JTextField();
		textField_32.setBackground(SystemColor.activeCaption);
		textField_32.setBounds(107, 86, 26, 27);
		frame.getContentPane().add(textField_32);
		fields[1][3] = textField_32;
		
		textField_33 = new JTextField();
		textField_33.setBackground(SystemColor.activeCaption);
		textField_33.setBounds(107, 113, 26, 27);
		frame.getContentPane().add(textField_33);
		fields[2][3] = textField_33;
		
		textField_34 = new JTextField();
		textField_34.setBackground(SystemColor.activeCaption);
		textField_34.setBounds(133, 113, 26, 27);
		frame.getContentPane().add(textField_34);
		fields[2][4] = textField_34;
		
		textField_35 = new JTextField();
		textField_35.setBackground(SystemColor.activeCaption);
		textField_35.setBounds(159, 113, 26, 27);
		frame.getContentPane().add(textField_35);
		fields[2][5] = textField_35;
		
		textField_36 = new JTextField();
		textField_36.setBackground(SystemColor.controlHighlight);
		textField_36.setBounds(159, 140, 26, 27);
		frame.getContentPane().add(textField_36);
		fields[3][5] = textField_36;
		
		textField_37 = new JTextField();
		textField_37.setBackground(SystemColor.controlHighlight);
		textField_37.setBounds(133, 140, 26, 27);
		frame.getContentPane().add(textField_37);
		fields[3][4] = textField_37;
		
		textField_38 = new JTextField();
		textField_38.setBackground(SystemColor.controlHighlight);
		textField_38.setBounds(107, 140, 26, 27);
		frame.getContentPane().add(textField_38);
		fields[3][3] = textField_38;
		
		textField_39 = new JTextField();
		textField_39.setBackground(SystemColor.controlHighlight);
		textField_39.setColumns(10);
		textField_39.setBounds(107, 167, 26, 27);
		frame.getContentPane().add(textField_39);
		fields[4][3] = textField_39;
		
		textField_40 = new JTextField();
		textField_40.setBackground(SystemColor.controlHighlight);
		textField_40.setColumns(10);
		textField_40.setBounds(133, 167, 26, 27);
		frame.getContentPane().add(textField_40);
		fields[4][4] = textField_40;
		
		textField_41 = new JTextField();
		textField_41.setBackground(SystemColor.controlHighlight);
		textField_41.setColumns(10);
		textField_41.setBounds(159, 167, 26, 27);
		frame.getContentPane().add(textField_41);
		fields[4][5] = textField_41;
		
		textField_42 = new JTextField();
		textField_42.setBackground(SystemColor.controlHighlight);
		textField_42.setColumns(10);
		textField_42.setBounds(159, 194, 26, 27);
		frame.getContentPane().add(textField_42);
		fields[5][5] = textField_42;
		
		textField_43 = new JTextField();
		textField_43.setBackground(SystemColor.controlHighlight);
		textField_43.setColumns(10);
		textField_43.setBounds(133, 194, 26, 27);
		frame.getContentPane().add(textField_43);
		fields[5][4] = textField_43;
		
		textField_44 = new JTextField();
		textField_44.setBackground(SystemColor.controlHighlight);
		textField_44.setColumns(10);
		textField_44.setBounds(107, 194, 26, 27);
		frame.getContentPane().add(textField_44);
		fields[5][3] = textField_44;
		
		textField_45 = new JTextField();
		textField_45.setBackground(SystemColor.activeCaption);
		textField_45.setBounds(107, 221, 26, 27);
		frame.getContentPane().add(textField_45);
		fields[6][3] = textField_45;
		
		textField_46 = new JTextField();
		textField_46.setBackground(SystemColor.activeCaption);
		textField_46.setBounds(133, 221, 26, 27);
		frame.getContentPane().add(textField_46);
		fields[6][4] = textField_46;
		
		textField_47 = new JTextField();
		textField_47.setBackground(SystemColor.activeCaption);
		textField_47.setBounds(159, 221, 26, 27);
		frame.getContentPane().add(textField_47);
		fields[6][5] = textField_47;
		
		textField_48 = new JTextField();
		textField_48.setBackground(SystemColor.activeCaption);
		textField_48.setBounds(159, 248, 26, 27);
		frame.getContentPane().add(textField_48);
		fields[7][5] = textField_48;
		
		textField_49 = new JTextField();
		textField_49.setBackground(SystemColor.activeCaption);
		textField_49.setBounds(133, 248, 26, 27);
		frame.getContentPane().add(textField_49);
		fields[7][4] = textField_49;
		
		textField_50 = new JTextField();
		textField_50.setBackground(SystemColor.activeCaption);
		textField_50.setBounds(107, 248, 26, 27);
		frame.getContentPane().add(textField_50);
		fields[7][3] = textField_50;
		
		textField_51 = new JTextField();
		textField_51.setBackground(SystemColor.activeCaption);
		textField_51.setBounds(107, 275, 26, 27);
		frame.getContentPane().add(textField_51);
		fields[8][3] = textField_51;
		
		textField_52 = new JTextField();
		textField_52.setBackground(SystemColor.activeCaption);
		textField_52.setBounds(133, 275, 26, 27);
		frame.getContentPane().add(textField_52);
		fields[8][4] = textField_52;
		
		textField_53 = new JTextField();
		textField_53.setBackground(SystemColor.activeCaption);
		textField_53.setBounds(159, 275, 26, 27);
		frame.getContentPane().add(textField_53);
		fields[8][5] = textField_53;
		
		textField_54 = new JTextField();
		textField_54.setBackground(SystemColor.controlHighlight);
		textField_54.setBounds(185, 59, 26, 27);
		frame.getContentPane().add(textField_54);
		fields[0][6] = textField_54;
		
		textField_55 = new JTextField();
		textField_55.setBackground(SystemColor.controlHighlight);
		textField_55.setBounds(211, 59, 26, 27);
		frame.getContentPane().add(textField_55);
		fields[0][7] = textField_55;
		
		textField_56 = new JTextField();
		textField_56.setBackground(SystemColor.controlHighlight);
		textField_56.setBounds(237, 59, 26, 27);
		frame.getContentPane().add(textField_56);
		fields[0][8] = textField_56;
		
		textField_57 = new JTextField();
		textField_57.setBackground(SystemColor.controlHighlight);
		textField_57.setBounds(237, 86, 26, 27);
		frame.getContentPane().add(textField_57);
		fields[1][8] = textField_57;
		
		textField_58 = new JTextField();
		textField_58.setBackground(SystemColor.controlHighlight);
		textField_58.setBounds(211, 86, 26, 27);
		frame.getContentPane().add(textField_58);
		fields[1][7] = textField_58;
		
		textField_59 = new JTextField();
		textField_59.setBackground(SystemColor.controlHighlight);
		textField_59.setBounds(185, 86, 26, 27);
		frame.getContentPane().add(textField_59);
		fields[1][6] = textField_59;
		
		textField_60 = new JTextField();
		textField_60.setBackground(SystemColor.controlHighlight);
		textField_60.setBounds(185, 113, 26, 27);
		frame.getContentPane().add(textField_60);
		fields[2][6] = textField_60;
		
		textField_61 = new JTextField();
		textField_61.setBackground(SystemColor.controlHighlight);
		textField_61.setBounds(211, 113, 26, 27);
		frame.getContentPane().add(textField_61);
		fields[2][7] = textField_61;
		
		textField_62 = new JTextField();
		textField_62.setBackground(SystemColor.controlHighlight);
		textField_62.setBounds(237, 113, 26, 27);
		frame.getContentPane().add(textField_62);
		fields[2][8] = textField_62;
		
		textField_63 = new JTextField();
		textField_63.setBackground(SystemColor.activeCaption);
		textField_63.setBounds(237, 140, 26, 27);
		frame.getContentPane().add(textField_63);
		fields[3][8] = textField_63;
		
		textField_64 = new JTextField();
		textField_64.setBackground(SystemColor.activeCaption);
		textField_64.setBounds(211, 140, 26, 27);
		frame.getContentPane().add(textField_64);
		fields[3][7] = textField_64;
		
		textField_65 = new JTextField();
		textField_65.setBackground(SystemColor.activeCaption);
		textField_65.setBounds(185, 140, 26, 27);
		frame.getContentPane().add(textField_65);
		fields[3][6] = textField_65;
		
		textField_66 = new JTextField();
		textField_66.setBackground(SystemColor.activeCaption);
		textField_66.setColumns(10);
		textField_66.setBounds(185, 167, 26, 27);
		frame.getContentPane().add(textField_66);
		fields[4][6] = textField_66;
		
		textField_67 = new JTextField();
		textField_67.setBackground(SystemColor.activeCaption);
		textField_67.setColumns(10);
		textField_67.setBounds(211, 167, 26, 27);
		frame.getContentPane().add(textField_67);
		fields[4][7] = textField_67;
		
		textField_68 = new JTextField();
		textField_68.setBackground(SystemColor.activeCaption);
		textField_68.setColumns(10);
		textField_68.setBounds(237, 167, 26, 27);
		frame.getContentPane().add(textField_68);
		fields[4][8] = textField_68;
		
		textField_69 = new JTextField();
		textField_69.setBackground(SystemColor.activeCaption);
		textField_69.setColumns(10);
		textField_69.setBounds(237, 194, 26, 27);
		frame.getContentPane().add(textField_69);
		fields[5][8] = textField_69;
		
		textField_70 = new JTextField();
		textField_70.setBackground(SystemColor.activeCaption);
		textField_70.setColumns(10);
		textField_70.setBounds(211, 194, 26, 27);
		frame.getContentPane().add(textField_70);
		fields[5][7] = textField_70;
		
		textField_71 = new JTextField();
		textField_71.setBackground(SystemColor.activeCaption);
		textField_71.setColumns(10);
		textField_71.setBounds(185, 194, 26, 27);
		frame.getContentPane().add(textField_71);
		fields[5][6] = textField_71;
		
		textField_72 = new JTextField();
		textField_72.setBackground(SystemColor.controlHighlight);
		textField_72.setBounds(185, 221, 26, 27);
		frame.getContentPane().add(textField_72);
		fields[6][6] = textField_72;
		
		textField_73 = new JTextField();
		textField_73.setBackground(SystemColor.controlHighlight);
		textField_73.setBounds(211, 221, 26, 27);
		frame.getContentPane().add(textField_73);
		fields[6][7] = textField_73;
		
		textField_74 = new JTextField();
		textField_74.setBackground(SystemColor.controlHighlight);
		textField_74.setBounds(237, 221, 26, 27);
		frame.getContentPane().add(textField_74);
		fields[6][8] = textField_74;
		
		textField_75 = new JTextField();
		textField_75.setBackground(SystemColor.controlHighlight);
		textField_75.setBounds(237, 248, 26, 27);
		frame.getContentPane().add(textField_75);
		fields[7][8] = textField_75;
		
		textField_76 = new JTextField();
		textField_76.setBackground(SystemColor.controlHighlight);
		textField_76.setBounds(211, 248, 26, 27);
		frame.getContentPane().add(textField_76);
		fields[7][7] = textField_76;
		
		textField_77 = new JTextField();
		textField_77.setBackground(SystemColor.controlHighlight);
		textField_77.setBounds(185, 248, 26, 27);
		frame.getContentPane().add(textField_77);
		fields[7][6] = textField_77;
		
		textField_78 = new JTextField();
		textField_78.setBackground(SystemColor.controlHighlight);
		textField_78.setBounds(185, 275, 26, 27);
		frame.getContentPane().add(textField_78);
		fields[8][6] = textField_78;
		
		textField_79 = new JTextField();
		textField_79.setBackground(SystemColor.controlHighlight);
		textField_79.setBounds(211, 275, 26, 27);
		frame.getContentPane().add(textField_79);
		fields[8][7] = textField_79;
		
		textField_80 = new JTextField();
		textField_80.setBackground(SystemColor.controlHighlight);
		textField_80.setBounds(237, 275, 26, 27);
		frame.getContentPane().add(textField_80);
		fields[8][8] = textField_80;
		
		JButton btnSolve = new JButton("Give Up");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[][] cloneGrid = new int[9][];
				
				for(int i = 0; i < 9; i++)
				    cloneGrid[i] = startGrid[i].clone();
				solveSudoku(cloneGrid);
				displayGrid(cloneGrid);

				
			}
		});
		btnSolve.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSolve.setBounds(299, 164, 103, 27);
		frame.getContentPane().add(btnSolve);
		
		
		
		lblMohammadIhraiz = new JLabel("");
		lblMohammadIhraiz.setText("Mohammad Ihraiz \r");
		lblMohammadIhraiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblMohammadIhraiz.setFont(new Font("Bungee Inline", Font.PLAIN, 10));
		lblMohammadIhraiz.setBackground(SystemColor.activeCaptionBorder);
		lblMohammadIhraiz.setBounds(294, 292, 123, 13);
		frame.getContentPane().add(lblMohammadIhraiz);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ma-re\\Downloads\\sudoku (1).png"));
		lblNewLabel.setBounds(284, 196, 137, 100);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newGame();
				displayGrid();

			}
		});
		btnNewGame.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewGame.setBounds(299, 69, 103, 27);
		frame.getContentPane().add(btnNewGame);
		
		lblDif = new JLabel("Difficulty - 1.00");
		lblDif.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDif.setHorizontalAlignment(SwingConstants.CENTER);
		lblDif.setFont(new Font("Bungee Inline", Font.PLAIN, 11));
		lblDif.setBackground(SystemColor.activeCaptionBorder);
		lblDif.setBounds(29, 304, 234, 22);
		frame.getContentPane().add(lblDif);
		
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HashMap<String, Integer> numbers = new HashMap<String, Integer>() ;
				for(int i = 1; i<=9; i++) {
					numbers.put(i+"", i);
				}
				
				int[][] grid = new int[9][9];
				boolean isDone = true;
				for(int i=0; i < 9; i++) {
					for(int j=0; j < 9; j++) {
						if(fields[i][j].getText().equals("")) {
							isDone = false;
							break;
						}
						
						grid[i][j] = Integer.parseInt(fields[i][j].getText().trim());
						
					}
					if(!isDone)
						break;
				}
				
				boolean gg = false;
				if(isDone) {
					if(checkRows(grid)) {
						if(checkColumns(grid)) {
							if(checkSubGrids(grid)) {
								JOptionPane.showMessageDialog(new JFrame(), "Good job, You solved it", "GG",
								        JOptionPane.INFORMATION_MESSAGE);
								gg=true;
							}
							
						}
					}
					
					if(!gg) {
						JOptionPane.showMessageDialog(new JFrame(), "Nice Try but you need to think harder", "NT",
						        JOptionPane.INFORMATION_MESSAGE);
					}
					
					
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Wrong Entry, please fill the grid properly", "Data Error",
					        JOptionPane.ERROR_MESSAGE);
				}
			}

			private boolean checkSubGrids(int[][] grid) {
				return checkSubGrid(grid,0) && checkSubGrid(grid,3) && checkSubGrid(grid,6);
			}

			private boolean checkSubGrid(int[][] grid,int boxRowStart) {
				

				for(int boxColStart = 0; boxColStart <= 6; boxColStart+=3) {
					int[] bool = new int[10];
					for (int r = boxRowStart; r < boxRowStart + 3; r++) {
						for (int d = boxColStart; d < boxColStart + 3; d++) {
							if (bool[grid[r][d]] > 0) {
								fields[r][d].setForeground(Color.YELLOW);
								return false;
							}
							bool[grid[r][d]] = 1;
						}
					}
				}
				return true;
			}

			private boolean checkRows(int[][] grid) {
				for(int i = 0; i < 9; i++) {
					int[] bool = new int[10];
					for(int j = 0; j < 9; j++) {
						if(bool[grid[j][i]] > 0) {
							fields[j][i].setForeground(Color.YELLOW);
							return false;
						}
						bool[grid[j][i]] = 1;
					}
				}
				return true;
			}

			private boolean checkColumns(int[][] grid) {
				
				for(int i = 0; i < 9; i++) {
					int[] bool = new int[10];
					for(int j = 0; j < 9; j++) {
						if(bool[grid[i][j]] > 0) {
							fields[i][j].setForeground(Color.YELLOW);
							return false;
						}
						bool[grid[i][j]] = 1;
					}
				}
				return true;
			}
		});
		btnCheck.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCheck.setBounds(299, 101, 103, 27);
		frame.getContentPane().add(btnCheck);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayGrid();
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnReset.setBounds(299, 134, 103, 27);
		frame.getContentPane().add(btnReset);
		
		Random rn = new Random();
		int rnd = rn.nextInt(10) +1;
		readGrid(new File("files/"+rnd+".txt"));
		displayGrid();
	}
	
	private void readGrid(File f) {
		Scanner scan = null;
		
		try {
			scan = new Scanner(f);
			for(int i =0; i < 9; i++) {
				String line = scan.nextLine();
				String[] row = line.split(" ");
				for(int j = 0; j < 9; j++) {
					startGrid[i][j] = Integer.parseInt(row[j]);
				}
			}
			String line = scan.nextLine();
			line = scan.nextLine();
			startGridDif = line;
		} catch(Exception e1) {
			JOptionPane.showMessageDialog(new JFrame(), "Wrong Entry, please repair the files", "Data Error",
			        JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void newGame() {
		Random rn = new Random();
		int rnd = rn.nextInt(10) +1;
		System.out.println(rnd);
		readGrid(new File("files/"+rnd+".txt"));
	}
	
	private void displayGrid() {
		for(int i = 0; i < 9; i++) {
			for(int j =0; j < 9; j++) {
				if(startGrid[i][j] != 0) {
					fields[i][j].setText(" " + startGrid[i][j]);
					fields[i][j].setEditable(false);
					fields[i][j].setForeground(Color.RED);
					continue;
				}
				fields[i][j].setText("");
				fields[i][j].setEditable(true);
				fields[i][j].setForeground(Color.BLACK);
				
			}
		}
		lblDif.setText(startGridDif);
	}
	
	
	private void displayGrid(int[][] grid) {
		for(int i = 0; i < 9; i++) {
			for(int j =0; j < 9; j++) {
					fields[i][j].setText(" " + grid[i][j]);
			}
		}
	}
	
	public static boolean isSafe(int[][] board, int row, int col, int num) {
		// Row has the unique (row-clash)
		for (int d = 0; d < board.length; d++) {
			if (board[row][d] == num) {
				return false;
			}
		}

		// Column has the unique numbers (column-clash)
		for (int r = 0; r < board.length; r++) {

			if (board[r][col] == num) {
				return false;
			}
		}

		// Corresponding square has
		// unique number (box-clash)
		int sqrt = (int) Math.sqrt(9);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;

		for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
			for (int d = boxColStart; d < boxColStart + sqrt; d++) {
				if (board[r][d] == num) {
					return false;
				}
			}
		}

		// if there is no clash, it's safe
		return true;
	}

	public static boolean solveSudoku(int[][] board) {
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;
					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}

		// No empty space left
		if (isEmpty) {
			return true;
		}

		// Else for each-row backtrack
		for (int num = 1; num <= 9; num++) {
			if (isSafe(board, row, col, num)) {
				board[row][col] = num;
				if (solveSudoku(board)) {
					// print(board, n);
					return true;
				} else {
					// replace it
					board[row][col] = 0;
				}
			}
		}
		return false;
	}
	
	public static void print(int[][] board, int N) {

		// We got the answer, just print it
		for (int r = 0; r < N; r++) {
			for (int d = 0; d < N; d++) {
				System.out.print(board[r][d]);
				System.out.print(" ");
			}
			System.out.print("\n");

			if ((r + 1) % (int) Math.sqrt(N) == 0) {
				System.out.print("");
			}
		}
	}
}
