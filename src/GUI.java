/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUI.java
 *
 * Created on Oct 12, 2010, 4:20:09 PM
 */
/**
 *
 * @author Midoyass
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.io.IOException;
import java.util.*;
import java.util.StringTokenizer;

public class GUI extends javax.swing.JFrame {

    /** Creates new form GUI */
//    public BitOutputStream O;
    public GUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Compress = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        compressTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        compressLabel = new javax.swing.JTextArea();
        Decompress_Fild = new javax.swing.JTextField();
        Decompress = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Andalus", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LZW Compression");

        Compress.setText("Compress");
        Compress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompressActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        compressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compressTxtActionPerformed(evt);
            }
        });

        compressLabel.setColumns(20);
        compressLabel.setEditable(false);
        compressLabel.setRows(5);
        jScrollPane1.setViewportView(compressLabel);

        Decompress_Fild.setEditable(false);
        Decompress_Fild.setFont(new java.awt.Font("Courier New", 3, 14));
        Decompress_Fild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Decompress_FildActionPerformed(evt);
            }
        });

        Decompress.setText("Decompress");
        Decompress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecompressActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(Compress)
                .addGap(45, 45, 45)
                .addComponent(Clear)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(compressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(Decompress)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Decompress_Fild, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(compressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear)
                    .addComponent(Compress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Decompress_Fild, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Decompress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompressActionPerformed

        PrintWriter outputFile,noOfBits;
        FileOutputStream out;
        BitOutputStream BOS;
        try {
            noOfBits=new PrintWriter("index.txt");
            outputFile = new PrintWriter("Compress.txt");
             out=new FileOutputStream("BitsFile.txt");
             BOS=new BitOutputStream(out);

            String dict = "";
            String data = "";
            String comp = "";
            String getString = "";
            String show = "";
            char[] array;
            int[] index = new int[100];
            int indexArray = 0;
            int count = 0;
            int j;
            boolean status = false;
            ArrayList<String> dic = new ArrayList();
            for (int i = 0; i <= 127; i++) {
                dict += (char) i;
                dic.add(dict);
                dict = "";

            }

            data = this.compressTxt.getText();
            array = data.toCharArray();
            for (j = 0; j < data.length(); j++) {
                comp += array[j];
                for (int k = 0; k < dic.size(); k++) {
                    getString = dic.get(k);
//                     System.out.println(getString+"     "+comp+ "    "+ j);
                    if (getString.equals(comp)) {
                        status = true;
                        indexArray = k;
                        break;
                    }
                    if (!getString.equals(comp) || k==dic.size()-1) {
                        status = false;

                        continue;
                    }
                }

  if(status==false)
  {
  index[count]=indexArray;
  count++;
  dic.add(comp);
  comp="";
  j--;
  }
    
    if(j>=data.length()-1)
    {
        //System.out.println("j========="+j+"data========="+(data.length()-1)+"============="+ indexArray);
  index[count]=indexArray;
  count++;
  dic.add(comp);
  comp="";
//  status=true;
  continue;
 //  break;
    }
     
            }

            int bits;
            for (int i = 0; i < count; i++) {
                bits=BitOutputStream.getRequiredNumOfBits(index[i]);
                noOfBits.println(bits);
                try {
                    BOS.writeBits(index[i], bits);
               // O.writeBits(index[i], bits);
                outputFile.println(index[i]);
                show += index[i];
                show += " , ";
                                } catch (IOException ex) {
                 ex.getMessage();
                }
            }

            this.compressLabel.setText("Compress : \n" + show);
            try {
                BOS.flush();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                BOS.close();
//           System.out.println(dic);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

//           System.out.println(dic);
            noOfBits.close();
            outputFile.close();
            } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_CompressActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        this.compressLabel.setText("");
        this.compressTxt.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void DecompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecompressActionPerformed
 String dict="";
  String data="";
 String st="";
 String deCompress="";
 int index;
 int [] indexIn=new int[100];
 int count=0;
char nextC;
String dummy="";
 ArrayList <String> dic2= new ArrayList();
for(int i=0;i<=127 ; i++)
{
dict+=(char)i;
dic2.add(dict);
dict="";
}

      // Open the file.
      int [] indexInFile=new int[100];
      //File file = new File("Compress.txt");
      File indexFile = new File("index.txt");
        FileInputStream in;
        BitInputStream BIS;
      Scanner inputFile;
        try {
            in=new FileInputStream("BitsFile.txt");
            BIS=new BitInputStream(in);
      inputFile = new Scanner(indexFile);
      while (inputFile.hasNext())
      {
         // Read the next name.
         deCompress = inputFile.nextLine();
         index=Integer.parseInt(deCompress);
         indexInFile[count]=index;
         count++;
      }
           int countter=0;
      int convert;
           while(countter<=count)
      {
                try {
                    convert = BIS.readBits(indexInFile[countter]);
//                    System.out.println(convert);
                    indexIn[countter]=convert;
                    countter++;
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }

      }
       for (int j = 0; j < count; j++) {
         st=dic2.get(indexIn[j]);
         dic2.add(st);
         data+=st;
                      //System.out.println(data);
         //if(j<(count-1)){

             dummy+=dic2.get(indexIn[j+1]);

             st+=dummy.charAt(0);
             
             dic2.set(dic2.size()-1 ,st);
         //}
        dummy="";
         st="";
       }
      this.Decompress_Fild.setText("Decompress : \n"+data);
//   System.out.println(dic2);
   //System.out.println("--------");
      
   inputFile.close();
        } catch (FileNotFoundException ex) {
        this.Decompress_Fild.setText("Erorr - There Is No File To Decompress !!");
        }

    }//GEN-LAST:event_DecompressActionPerformed

    private void Decompress_FildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decompress_FildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Decompress_FildActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
   System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void compressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compressTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Compress;
    private javax.swing.JButton Decompress;
    private javax.swing.JTextField Decompress_Fild;
    private javax.swing.JTextArea compressLabel;
    private javax.swing.JTextField compressTxt;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
