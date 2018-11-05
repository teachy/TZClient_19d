package com.tu.client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import com.tu.TZ.TZcontrol;
import com.tu.TZ.D19.D19_tz;
import com.tu.TZ.D19.D19_tz_fengkuang;
import com.tu.TZ.D19.D19_tz_jisu;
import com.tu.app.Config;
import com.tu.celue.CelueControl;
import com.tu.loadCheck.LoadImple;
import com.tu.loadWz.BT.LoadingBT;
import com.tu.loadWz.D19.Loading19D;
import com.tu.loadWz.XM.loadingXM;
import com.tu.pojo.PTpojo;
import com.tu.pojo.TZcelue;
import com.tu.pojo.WZpojo;
import com.tu.pojo.enums.GameEnum;
import com.tu.pojo.enums.SfEnum;
import com.tu.pojo.enums.SfEnumPL;
import com.tu.pojo.enums.WzEnum;

public class LoginClient extends javax.swing.JFrame {
    private static final long serialVersionUID = -3402822734314184624L;
    
    private JSplitPane jSplitPane1;
    
    private JTextField jText_FB_2; // 翻倍2
    
    private JTextField jText_FB_1; // 翻倍1
    
    private JPanel jPanel6;
    
    private JTextField jText_time_100; // 时间100
    
    private JLabel jLabel19;
    
    private JTextField jText_time_80; // 时间80
    
    private JLabel jLabel18;
    
    private JTextField jText_time_60; // 时间60
    
    private JLabel jLabel17;
    
    private JTextField jText_time_40; // 时间40
    
    private JTextField jText_YZM;
    
    private JLabel jLabel_YZM;
    
    private JLabel jLabel_my_href;
    
    private JLabel jLabel4;
    
    private JLabel jLabel_my_QQ;
    
    private JLabel jLabel3;
    
    private JLabel jLabel2;
    
    private JLabel jLabel_KJDJS2; // 显示开奖倒计时
    
    private JLabel jLabel_TZDJS2; // 显示投注倒计时
    
    private JLabel jLabel_JBSL2; // 显示金币数量
    
    private JLabel jLabel_userID2; // 显示userId
    
    private JLabel jLabel1;
    
    private JTextField jText_FB_10; // 翻倍10
    
    private JTextField jText_FB_9; // 翻倍9
    
    private JTextField jText_FB_8; // 翻倍8
    
    private JTextField jText_FB_7; // 翻倍7
    
    private JLabel jLabel16;
    
    private JTextField jText_time_20; // 时间20
    
    private JPasswordField jPass_PT_password; // 平台登录密码
    
    private JPasswordField jPass_WZ_password; // 网站登录密码
    
    private JPanel jPanel8;
    
    private JTextField jText_QJ_GL; // 全局概率
    
    private JLabel jLabel20;
    
    private JPanel jPanel7;
    
    private JTextField jText_FB_6; // 翻倍6
    
    private JTextField jText_FB_5; // 翻倍5
    
    private JLabel jLabel26;
    
    private JTextField jText_TZ_js_min; // 投注基数最小值
    
    private JTextField jText_TZ_js_max; // 投注基数最大值
    
    private JLabel jLabel25;
    
    private JLabel jLabel24;
    
    private JTextField jText_WZ_username; // 网站登录名
    
    private JLabel jLabel5;
    
    private JButton btn_end; // 停止按钮
    
    private JButton btn_begin; // 开始按钮
    
    private JTextField jText_FB_4; // 翻倍4
    
    private JTextField jText_FB_3; // 翻倍3
    
    private JLabel jLabel15;
    
    private JTextField jText_time_0; // 时间0
    
    private JLabel jLabel14;
    
    private JPanel jPanel5;
    
    private JTextField jText_gold_max; // 最大值
    
    private JLabel jLabel13;
    
    private JTextField jText_gold_min; // 最小值
    
    private JLabel jLabel12;
    
    private JLabel jLabel11;
    
    private JPanel jPanel1;
    
    private JScrollPane jScrollPane1;
    
    private JLabel jLabel_KJDJS; // 开奖倒计时
    
    private JPanel jPanel4;
    
    private JComboBox jCom_PLSF; // 赔率算法
    
    private JLabel jLabel10;
    
    private JComboBox jCom_PTSF; // 普通算法
    
    private JLabel jLabel9;
    
    private JComboBox jCom_XZYX; // 选择游戏
    
    private JComboBox jCom_XZWZ; // 选择网站
    
    private JLabel jLabel8;
    
    private JLabel jLabel7;
    
    private JTextField jText_PT_username; // 平台登录名
    
    private JLabel jLabel6;
    
    private JLabel jLabel_TZDJS; // 投注倒计时
    
    private JLabel jLabel_JBSL; // 金币数量
    
    private JLabel jLabel_userId; // userId
    
    private JTextArea console; // 日志信息框
    
    private JPanel jPanel3;
    
    private JPanel jPanel2;
    
    private int rows; // 控制日志显示的行数
    
    private boolean stopAll = false; // 是否点击停止按钮
    
    private int WZ_index; // 网站信息
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginClient inst = new LoginClient();
                inst.setLocationRelativeTo(null);
                inst.setVisible(true);
                inst.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        System.exit(0);
                    }
                });
            }
        });
    }
    
    public LoginClient() {
        super();
        initGUI();
        initProperties();
    }
    
    /**
     * 读取配置信息，初始化界面
     */
    private void initProperties() {
        
        // 登录用户名和密码
        jText_PT_username.setText(Config.PT_username);
        jPass_PT_password.setText(Config.PT_password);
        jText_WZ_username.setText(Config.WZ_username);
        jPass_WZ_password.setText(Config.WZ_password);
        
        // 下拉选择
        String index = Config.PTSF;
        if (!index.matches("[0-9]+")) {
            index = "0";
        }
        jCom_PTSF.setSelectedIndex(new Integer(index));
        
        index = Config.XZWZ;
        if (!index.matches("[0-9]+")) {
            index = "0";
        }
        jCom_XZWZ.setSelectedIndex(new Integer(index));
        
        index = Config.XZYX;
        if (!index.matches("[0-9]+")) {
            index = "0";
        }
        jCom_XZYX.setSelectedIndex(new Integer(index));
        
        index = Config.PLSF;
        if (!index.matches("[0-9]+")) {
            index = "0";
        }
        jCom_PLSF.setSelectedIndex(new Integer(index));
        
        // 数量策略
        jText_gold_min.setText(Config.gold_min);
        jText_gold_max.setText(Config.gold_max);
        
        // 时间策略
        jText_time_0.setText(Config.time_0);
        jText_time_20.setText(Config.time_20);
        jText_time_40.setText(Config.time_40);
        jText_time_60.setText(Config.time_60);
        jText_time_80.setText(Config.time_80);
        jText_time_100.setText(Config.time_100);
        
        // 倍数策略
        jText_TZ_js_min.setText(Config.TZ_js_min);
        jText_TZ_js_max.setText(Config.TZ_js_max);
        jText_FB_10.setText(Config.FB_10);
        jText_FB_9.setText(Config.FB_9);
        jText_FB_8.setText(Config.FB_8);
        jText_FB_7.setText(Config.FB_7);
        jText_FB_6.setText(Config.FB_6);
        jText_FB_5.setText(Config.FB_5);
        jText_FB_4.setText(Config.FB_4);
        jText_FB_3.setText(Config.FB_3);
        jText_FB_2.setText(Config.FB_2);
        jText_FB_1.setText(Config.FB_1);
        
        // 全局停止投注概率策略
        jText_QJ_GL.setText(Config.QJ_GL);
        
        // qq和网址
        jLabel_my_QQ.setText(Config.my_QQ);
        jLabel_my_href.setText(Config.my_href);
        
    }
    
    @SuppressWarnings({"serial", "unchecked"})
    private void initGUI() {
        try {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            this.setTitle("\u767b\u5f55");
            {
                jSplitPane1 = new JSplitPane();
                getContentPane().add(jSplitPane1, BorderLayout.CENTER);
                jSplitPane1.setDividerLocation(590);
                jSplitPane1.setPreferredSize(new java.awt.Dimension(971, 536));
                {
                    jPanel1 = new JPanel();
                    BorderLayout jPanel1Layout = new BorderLayout();
                    jPanel1.setLayout(jPanel1Layout);
                    jSplitPane1.add(jPanel1, JSplitPane.RIGHT);
                    {
                        jPanel3 = new JPanel();
                        jPanel1.add(jPanel3, BorderLayout.NORTH);
                        jPanel3
                            .setPreferredSize(new java.awt.Dimension(366, 99));
                        jPanel3.setBorder(
                            BorderFactory.createTitledBorder("用户信息"));
                        jPanel3.setLayout(null);
                        {
                            jLabel_userId = new JLabel();
                            jPanel3.add(jLabel_userId);
                            jLabel_userId.setText("userId\uff1a");
                            jLabel_userId.setBounds(35, 27, 56, 22);
                        }
                        {
                            jLabel_JBSL = new JLabel();
                            jPanel3.add(jLabel_JBSL);
                            jLabel_JBSL
                                .setText("\u91d1\u5e01\u6570\u91cf\uff1a");
                            jLabel_JBSL.setBounds(23, 57, 68, 22);
                        }
                        {
                            jLabel_TZDJS = new JLabel();
                            jPanel3.add(jLabel_TZDJS);
                            jLabel_TZDJS.setText(
                                "\u6295\u6ce8\u5012\u8ba1\u65f6\uff1a");
                            jLabel_TZDJS.setBounds(188, 27, 80, 22);
                        }
                        {
                            jLabel_KJDJS = new JLabel();
                            jPanel3.add(jLabel_KJDJS);
                            jLabel_KJDJS.setText(
                                "\u5f00\u5956\u5012\u8ba1\u65f6\uff1a");
                            jLabel_KJDJS.setBounds(188, 54, 80, 22);
                        }
                        {
                            jLabel_userID2 = new JLabel();
                            jPanel3.add(jLabel_userID2);
                            jLabel_userID2.setText("userId");
                            jLabel_userID2.setBounds(91, 31, 91, 15);
                        }
                        {
                            jLabel_JBSL2 = new JLabel();
                            jPanel3.add(jLabel_JBSL2);
                            jLabel_JBSL2.setText("\u91d1\u5e01\u6570\u91cf");
                            jLabel_JBSL2.setBounds(91, 61, 85, 15);
                        }
                        {
                            jLabel_TZDJS2 = new JLabel();
                            jPanel3.add(jLabel_TZDJS2);
                            jLabel_TZDJS2
                                .setText("\u6295\u6ce8\u5012\u8ba1\u65f6");
                            jLabel_TZDJS2.setBounds(268, 31, 94, 15);
                        }
                        {
                            jLabel_KJDJS2 = new JLabel();
                            jPanel3.add(jLabel_KJDJS2);
                            jLabel_KJDJS2
                                .setText("\u5f00\u5956\u5012\u8ba1\u65f6");
                            jLabel_KJDJS2.setBounds(268, 58, 94, 15);
                        }
                    }
                    {
                        jScrollPane1 = new JScrollPane();
                        jPanel1.add(jScrollPane1, BorderLayout.CENTER);
                        jScrollPane1.setBorder(
                            BorderFactory.createTitledBorder("日志信息"));
                        {
                            console = new JTextArea();
                            jScrollPane1.setViewportView(console);
                            console.setText("");
                            
                            // 显示3行
                            rows = 12;
                            // 重写insert方法，实现显示行数的控制
                            console.setDocument(new PlainDocument() {
                                @Override
                                public void insertString(int offs, String str,
                                    AttributeSet a)
                                    throws BadLocationException {
                                    String value = console.getText();
                                    int overrun = 0;
                                    if (value != null
                                        && value.indexOf('\n') >= 0
                                        && value.split("\n").length >= rows) {
                                        overrun = value.indexOf('\n') + 1;
                                        super.remove(0, overrun);
                                    }
                                    super.insertString(offs - overrun, str, a);
                                }
                            });
                            
                        }
                    }
                }
                {
                    jPanel2 = new JPanel();
                    jSplitPane1.add(jPanel2, JSplitPane.LEFT);
                    jPanel2.setBorder(BorderFactory.createTitledBorder("登录信息"));
                    jPanel2.setLayout(null);
                    jPanel2.setPreferredSize(new java.awt.Dimension(589, 519));
                    {
                        jLabel6 = new JLabel();
                        jPanel2.add(jLabel6);
                        jLabel6.setText("\u5e73\u53f0\u767b\u5f55\u540d\uff1a");
                        jLabel6.setBounds(17, 27, 79, 15);
                    }
                    {
                        jText_PT_username = new JTextField();
                        jPanel2.add(jText_PT_username);
                        jText_PT_username.setBounds(95, 24, 190, 22);
                        jText_PT_username.setText("teachy");
                    }
                    {
                        jLabel7 = new JLabel();
                        jPanel2.add(jLabel7);
                        jLabel7.setText("\u767b\u5f55\u5bc6\u7801\uff1a");
                        jLabel7.setBounds(315, 27, 68, 15);
                    }
                    {
                        jLabel8 = new JLabel();
                        jPanel2.add(jLabel8);
                        jLabel8.setText("\u9009\u62e9\u7f51\u7ad9\uff1a");
                        jLabel8.setBounds(28, 87, 70, 15);
                    }
                    {
                        // 选择网站
                        ComboBoxModel jComboBox1Model =
                            new DefaultComboBoxModel(WzEnum.values());
                        jCom_XZWZ = new JComboBox();
                        jPanel2.add(jCom_XZWZ);
                        jCom_XZWZ.setModel(jComboBox1Model);
                        jCom_XZWZ.setBounds(95, 83, 208, 22);
                        jCom_XZWZ.setSize(190, 22);
                        jCom_XZWZ.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (jCom_XZWZ.getSelectedIndex() == 2) {
                                    Config.XZWZ = "2";
                                }
                                else if (jCom_XZWZ.getSelectedIndex() == 4) {
                                    Config.XZWZ = "4";
                                }
                                getImgByWz();
                                readImg();
                            }
                        });
                    }
                    {
                        // 选择游戏
                        ComboBoxModel jComboBox2Model =
                            new DefaultComboBoxModel(GameEnum.values());
                        jCom_XZYX = new JComboBox();
                        jPanel2.add(jCom_XZYX);
                        jCom_XZYX.setModel(jComboBox2Model);
                        jCom_XZYX.setBounds(383, 83, 208, 22);
                        jCom_XZYX.setSize(190, 22);
                    }
                    {
                        jLabel9 = new JLabel();
                        jPanel2.add(jLabel9);
                        jLabel9.setText("\u9009\u62e9\u6e38\u620f\uff1a");
                        jLabel9.setBounds(315, 87, 70, 15);
                    }
                    {
                        // 普通算法
                        ComboBoxModel jComboBox3Model =
                            new DefaultComboBoxModel(SfEnum.values());
                        jCom_PTSF = new JComboBox();
                        jPanel2.add(jCom_PTSF);
                        jCom_PTSF.setModel(jComboBox3Model);
                        jCom_PTSF.setBounds(95, 115, 208, 22);
                        jCom_PTSF.setSize(190, 22);
                    }
                    {
                        jLabel10 = new JLabel();
                        jPanel2.add(jLabel10);
                        jLabel10.setText("\u666e\u901a\u7b97\u6cd5\uff1a");
                        jLabel10.setBounds(28, 119, 70, 15);
                    }
                    {
                        // 赔率算法
                        ComboBoxModel jComboBox4Model =
                            new DefaultComboBoxModel(SfEnumPL.values());
                        jCom_PLSF = new JComboBox();
                        jPanel2.add(jCom_PLSF);
                        jCom_PLSF.setModel(jComboBox4Model);
                        jCom_PLSF.setBounds(383, 115, 209, 22);
                        jCom_PLSF.setSize(190, 22);
                    }
                    {
                        jLabel11 = new JLabel();
                        jPanel2.add(jLabel11);
                        jLabel11.setText("\u8d54\u7387\u7b97\u6cd5\uff1a");
                        jLabel11.setBounds(316, 119, 70, 15);
                    }
                    {
                        jPanel4 = new JPanel();
                        jPanel2.add(jPanel4);
                        jPanel4.setBounds(5, 146, 568, 62);
                        jPanel4.setBorder(
                            BorderFactory.createTitledBorder("数量策略"));
                        jPanel4.setLayout(null);
                        {
                            jLabel12 = new JLabel();
                            jPanel4.add(jLabel12);
                            jLabel12.setText("\u6700\u5c0f\u503c\uff1a");
                            jLabel12.setBounds(30, 29, 52, 15);
                        }
                        {
                            jText_gold_min = new JTextField();
                            jPanel4.add(jText_gold_min);
                            jText_gold_min.setBounds(82, 26, 80, 22);
                            jText_gold_min.setText("10000");
                            jText_gold_min.setSize(96, 22);
                        }
                        {
                            jLabel13 = new JLabel();
                            jPanel4.add(jLabel13);
                            jLabel13.setText("\u6700\u5927\u503c\uff1a");
                            jLabel13.setBounds(199, 29, 54, 15);
                        }
                        {
                            jText_gold_max = new JTextField();
                            jPanel4.add(jText_gold_max);
                            jText_gold_max.setBounds(253, 26, 10, 22);
                            jText_gold_max.setText("5000000");
                            jText_gold_max.setSize(96, 22);
                        }
                    }
                    {
                        jPanel5 = new JPanel();
                        jPanel2.add(jPanel5);
                        jPanel5.setBounds(5, 215, 568, 83);
                        jPanel5.setBorder(
                            BorderFactory.createTitledBorder("时间策略"));
                        jPanel5.setLayout(null);
                        {
                            jLabel14 = new JLabel();
                            jPanel5.add(jLabel14);
                            jLabel14.setText("0%");
                            jLabel14.setBounds(56, 24, 27, 15);
                        }
                        {
                            jText_time_0 = new JTextField();
                            jPanel5.add(jText_time_0);
                            jText_time_0.setText("0,1,2,3,4,5,6,7");
                            jText_time_0.setBounds(83, 21, 96, 22);
                        }
                        {
                            jLabel15 = new JLabel();
                            jPanel5.add(jLabel15);
                            jLabel15.setText("20%");
                            jLabel15.setBounds(224, 24, 30, 15);
                        }
                        {
                            jText_time_20 = new JTextField();
                            jPanel5.add(jText_time_20);
                            jText_time_20.setText("12,13,18,17");
                            jText_time_20.setBounds(253, 21, 125, 22);
                            jText_time_20.setSize(96, 22);
                        }
                        {
                            jLabel16 = new JLabel();
                            jPanel5.add(jLabel16);
                            jLabel16.setText("40%");
                            jLabel16.setBounds(394, 24, 24, 15);
                        }
                        {
                            jText_time_40 = new JTextField();
                            jPanel5.add(jText_time_40);
                            jText_time_40.setBounds(427, 21, 96, 22);
                            jText_time_40.setText("8");
                        }
                        {
                            jLabel17 = new JLabel();
                            jPanel5.add(jLabel17);
                            jLabel17.setText("60%");
                            jLabel17.setBounds(53, 52, 33, 15);
                        }
                        {
                            jText_time_60 = new JTextField();
                            jPanel5.add(jText_time_60);
                            jText_time_60.setBounds(83, 50, 95, 22);
                            jText_time_60.setSize(96, 22);
                        }
                        {
                            jLabel18 = new JLabel();
                            jPanel5.add(jLabel18);
                            jLabel18.setText("80%");
                            jLabel18.setBounds(224, 53, 29, 15);
                        }
                        {
                            jText_time_80 = new JTextField();
                            jPanel5.add(jText_time_80);
                            jText_time_80.setBounds(254, 50, 121, 22);
                            jText_time_80.setText("14,15,16");
                            jText_time_80.setSize(96, 22);
                        }
                        {
                            jLabel19 = new JLabel();
                            jPanel5.add(jLabel19);
                            jLabel19.setText("100%");
                            jLabel19.setBounds(391, 52, 36, 15);
                        }
                        {
                            jText_time_100 = new JTextField();
                            jPanel5.add(jText_time_100);
                            jText_time_100.setBounds(427, 50, 96, 22);
                            jText_time_100.setText("20,21,22");
                        }
                    }
                    {
                        jPanel6 = new JPanel();
                        jPanel2.add(jPanel6);
                        jPanel6.setBorder(
                            BorderFactory.createTitledBorder("倍数策略"));
                        jPanel6.setLayout(null);
                        jPanel6.setBounds(5, 307, 568, 114);
                        {
                            jText_FB_1 = new JTextField();
                            jPanel6.add(jText_FB_1);
                            jText_FB_1.setText("");
                            jText_FB_1.setBounds(110, 53, 70, 22);
                        }
                        {
                            jText_FB_2 = new JTextField();
                            jPanel6.add(jText_FB_2);
                            jText_FB_2.setText("");
                            jText_FB_2.setBounds(195, 53, 70, 22);
                        }
                        {
                            jText_FB_3 = new JTextField();
                            jPanel6.add(jText_FB_3);
                            jText_FB_3.setText("");
                            jText_FB_3.setBounds(282, 53, 70, 22);
                        }
                        {
                            jText_FB_4 = new JTextField();
                            jPanel6.add(jText_FB_4);
                            jText_FB_4.setBounds(370, 53, 70, 22);
                            jText_FB_4.setText("");
                        }
                        {
                            jLabel25 = new JLabel();
                            jPanel6.add(jLabel25);
                            jLabel25.setText(
                                "\u6295\u6ce8\u57fa\u6570\u6700\u5c0f\u503c\uff1a");
                            jLabel25.setBounds(5, 26, 118, 15);
                        }
                        {
                            jText_TZ_js_min = new JTextField();
                            jPanel6.add(jText_TZ_js_min);
                            jText_TZ_js_min.setText("1000");
                            jText_TZ_js_min.setBounds(110, 23, 70, 22);
                        }
                        {
                            jLabel26 = new JLabel();
                            jPanel6.add(jLabel26);
                            jLabel26.setText("\u8f93\u540e\u7ffb\u500d(1-5)");
                            jLabel26.setBounds(13, 56, 98, 15);
                        }
                        {
                            jText_FB_5 = new JTextField();
                            jPanel6.add(jText_FB_5);
                            jText_FB_5.setBounds(454, 53, 70, 22);
                            jText_FB_5.setText("10");
                        }
                        {
                            jText_FB_6 = new JTextField();
                            jPanel6.add(jText_FB_6);
                            jText_FB_6.setBounds(110, 83, 70, 22);
                            jText_FB_6.setText("12");
                        }
                        {
                            jText_FB_7 = new JTextField();
                            jPanel6.add(jText_FB_7);
                            jText_FB_7.setBounds(195, 83, 70, 22);
                        }
                        {
                            jText_FB_8 = new JTextField();
                            jPanel6.add(jText_FB_8);
                            jText_FB_8.setBounds(282, 83, 70, 22);
                        }
                        {
                            jText_FB_9 = new JTextField();
                            jPanel6.add(jText_FB_9);
                            jText_FB_9.setBounds(370, 83, 70, 22);
                        }
                        {
                            jText_FB_10 = new JTextField();
                            jPanel6.add(jText_FB_10);
                            jText_FB_10.setBounds(454, 83, 70, 22);
                        }
                        {
                            jLabel1 = new JLabel();
                            jPanel6.add(jLabel1);
                            jLabel1.setText("\u8f93\u540e\u7ffb\u500d(6-10)");
                            jLabel1.setBounds(7, 86, 103, 15);
                        }
                        {
                            jLabel2 = new JLabel();
                            jPanel6.add(jLabel2);
                            jLabel2.setText(
                                "\u6295\u6ce8\u57fa\u6570\u6700\u5927\u503c\uff1a");
                            jLabel2.setBounds(224, 26, 108, 15);
                        }
                        {
                            jText_TZ_js_max = new JTextField();
                            jPanel6.add(jText_TZ_js_max);
                            jText_TZ_js_max.setBounds(331, 23, 71, 22);
                        }
                    }
                    {
                        btn_begin = new JButton();
                        jPanel2.add(btn_begin);
                        btn_begin.setText("\u5f00\u59cb");
                        btn_begin.setBounds(225, 499, 60, 22);
                        
                        btn_begin.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent evt) {
                                beginActionPerformed(evt);
                            }
                        });
                        
                    }
                    {
                        btn_end = new JButton();
                        jPanel2.add(btn_end);
                        btn_end.setText("\u505c\u6b62");
                        btn_end.setBounds(316, 499, 60, 22);
                        btn_end.setVisible(false);
                        btn_end.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent evt) {
                                endActionPerformed(evt);
                            }
                        });
                        
                    }
                    {
                        jLabel5 = new JLabel();
                        jPanel2.add(jLabel5);
                        jLabel5.setText("\u767b\u5f55\u5bc6\u7801\uff1a");
                        jLabel5.setBounds(315, 56, 68, 15);
                    }
                    {
                        jText_WZ_username = new JTextField();
                        jPanel2.add(jText_WZ_username);
                        jText_WZ_username.setText("");
                        jText_WZ_username.setBounds(95, 53, 190, 22);
                    }
                    {
                        jLabel24 = new JLabel();
                        jPanel2.add(jLabel24);
                        jLabel24
                            .setText("\u7f51\u7ad9\u767b\u5f55\u540d\uff1a");
                        jLabel24.setBounds(16, 56, 79, 15);
                    }
                    {
                        jPanel7 = new JPanel();
                        jPanel2.add(jPanel7);
                        jPanel7.setBorder(
                            BorderFactory.createTitledBorder("全局停止投注概率策略"));
                        jPanel7.setLayout(null);
                        jPanel7.setBounds(5, 431, 567, 56);
                        {
                            jLabel20 = new JLabel();
                            jPanel7.add(jLabel20);
                            jLabel20.setText("\u5168\u5c40\u6982\u7387\uff1a");
                            jLabel20.setBounds(18, 26, 68, 15);
                        }
                        {
                            jText_QJ_GL = new JTextField();
                            jPanel7.add(jText_QJ_GL);
                            jText_QJ_GL.setText("");
                            jText_QJ_GL.setBounds(86, 23, 66, 22);
                            jText_QJ_GL.setSize(64, 22);
                        }
                        {
                            jText_YZM = new JTextField();
                            jPanel7.add(jText_YZM);
                            jText_YZM.setText(
                                "\u8bf7\u8f93\u5165\u9a8c\u8bc1\u7801");
                            jText_YZM.setBounds(283, 25, 77, 22);
                            
                            jText_YZM.addFocusListener(new FocusListener() {
                                
                                @Override
                                public void focusLost(FocusEvent e) {
                                    if (jText_YZM.getText().equals("")) {
                                        jText_YZM.setText("请输入验证码");
                                    }
                                }
                                
                                @Override
                                public void focusGained(FocusEvent e) {
                                    if (jText_YZM.getText().equals("请输入验证码")) {
                                        jText_YZM.setText("");
                                    }
                                }
                            });
                            
                        }
                        {
                            jLabel_YZM = new JLabel();
                            jPanel7.add(jLabel_YZM);
                            jLabel_YZM.setText("\u9a8c\u8bc1\u7801\u533a");
                            jLabel_YZM.setBounds(215, 24, 64, 22);
                            // 添加单击刷新验证码事件
                            jLabel_YZM.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    // 刷新
                                    getImgByWz();
                                    readImg();
                                }
                            });
                            
                        }
                    }
                    {
                        jPass_PT_password = new JPasswordField();
                        jPanel2.add(jPass_PT_password);
                        jPass_PT_password.setText("");
                        jPass_PT_password.setBounds(383, 24, 189, 22);
                        jPass_PT_password.setSize(190, 22);
                    }
                    {
                        jPass_WZ_password = new JPasswordField();
                        jPanel2.add(jPass_WZ_password);
                        jPass_WZ_password.setText("");
                        jPass_WZ_password.setBounds(383, 53, 78, 22);
                        jPass_WZ_password.setSize(190, 22);
                    }
                }
            }
            {
                jPanel8 = new JPanel();
                FlowLayout jPanel8Layout = new FlowLayout(FlowLayout.LEFT);
                jPanel8.setLayout(jPanel8Layout);
                getContentPane().add(jPanel8, BorderLayout.SOUTH);
                jPanel8.setPreferredSize(new java.awt.Dimension(985, 32));
                {
                    jLabel3 = new JLabel();
                    jPanel8.add(jLabel3);
                    jLabel3.setText("\u3000\u3000\u8054\u7cfbQQ\uff1a");
                    jLabel3.setPreferredSize(new java.awt.Dimension(91, 24));
                    jLabel3.setFont(new java.awt.Font("宋体", 0, 14));
                    jLabel3.setForeground(new java.awt.Color(255, 0, 0));
                }
                {
                    jLabel_my_QQ = new JLabel();
                    jPanel8.add(jLabel_my_QQ);
                    jLabel_my_QQ.setText("\u3000\u3000\u8054\u7cfbQQ\uff1a");
                    jLabel_my_QQ
                        .setPreferredSize(new java.awt.Dimension(173, 24));
                    jLabel_my_QQ.setFont(new java.awt.Font("宋体", 0, 14));
                    jLabel_my_QQ.setForeground(new java.awt.Color(255, 0, 0));
                }
                {
                    jLabel4 = new JLabel();
                    jPanel8.add(jLabel4);
                    jLabel4.setText(
                        "\u3000\u3000\u3000\u3000\u3000\u7f51\u5740\uff1a");
                    jLabel4.setPreferredSize(new java.awt.Dimension(121, 24));
                    jLabel4.setFont(new java.awt.Font("宋体", 0, 14));
                    jLabel4.setForeground(new java.awt.Color(255, 0, 0));
                }
                {
                    jLabel_my_href = new JLabel();
                    jPanel8.add(jLabel_my_href);
                    jLabel_my_href.setText("www.baidu.com");
                    jLabel_my_href
                        .setPreferredSize(new java.awt.Dimension(337, 24));
                    jLabel_my_href.setFont(new java.awt.Font("宋体", 0, 14));
                    jLabel_my_href.setForeground(new java.awt.Color(255, 0, 0));
                }
            }
            pack();
            this.setSize(993, 598);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // begin，这里处理开始那个按钮
    @SuppressWarnings("deprecation")
    private void beginActionPerformed(ActionEvent evt) {
        // 这里根据界面最新值，把proter文件里面的值修改了，下次登录直接就是最新值了，而且也填在界面上了
        Config.updateProperties("PT_username", jText_PT_username.getText());
        Config.updateProperties("PT_password", jPass_PT_password.getText());
        Config.updateProperties("WZ_username", jText_WZ_username.getText());
        Config.updateProperties("WZ_password", jPass_WZ_password.getText());
        Config.updateProperties("XZWZ", jCom_XZWZ.getSelectedIndex() + "");
        Config.updateProperties("XZYX", jCom_XZYX.getSelectedIndex() + "");
        Config.updateProperties("PTSF", jCom_PTSF.getSelectedIndex() + "");
        Config.updateProperties("PLSF", jCom_PLSF.getSelectedIndex() + "");
        Config.updateProperties("gold_min", jText_gold_min.getText());
        Config.updateProperties("gold_max", jText_gold_max.getText());
        Config.updateProperties("time_0", jText_time_0.getText());
        Config.updateProperties("time_20", jText_time_20.getText());
        Config.updateProperties("time_40", jText_time_40.getText());
        Config.updateProperties("time_60", jText_time_60.getText());
        Config.updateProperties("time_80", jText_time_80.getText());
        Config.updateProperties("time_100", jText_time_100.getText());
        Config.updateProperties("TZ_js_min", jText_TZ_js_min.getText());
        Config.updateProperties("TZ_js_max", jText_TZ_js_max.getText());
        Config.updateProperties("FB_1", jText_FB_1.getText());
        Config.updateProperties("FB_2", jText_FB_2.getText());
        Config.updateProperties("FB_3", jText_FB_3.getText());
        Config.updateProperties("FB_4", jText_FB_4.getText());
        Config.updateProperties("FB_5", jText_FB_5.getText());
        Config.updateProperties("FB_6", jText_FB_6.getText());
        Config.updateProperties("FB_7", jText_FB_7.getText());
        Config.updateProperties("FB_8", jText_FB_8.getText());
        Config.updateProperties("FB_9", jText_FB_9.getText());
        Config.updateProperties("FB_10", jText_FB_10.getText());
        Config.updateProperties("QJ_GL", jText_QJ_GL.getText());
        if (WZ_index != jCom_XZWZ.getSelectedIndex()) {
            WZpojo.setWz_State("0");
        }
        // **************************写入实体PT*****************************//
        // 平台
        // if ("1".equals(PTpojo.getPt_State())) {
        //
        // } else {
        // checkPT();
        // }
        // 网站
        if ("1".equals(WZpojo.getWz_State())) {
            
        }
        else {
            checkWZ();
        }
        setCeLue();
        // **************************写入实体PT*****************************//
        new Thread(new Runnable() {
            public void run() {
                if (WZpojo.getWz_State().equals("1")) {
                    stopAll = false;
                    btn_end.setVisible(true);
                    btn_begin.setVisible(false);
                    jLabel_YZM.setVisible(false);
                    jText_YZM.setVisible(false);
                    jLabel_JBSL2.setText(WZpojo.getWz_gold());
                    jLabel_userID2.setText(WZpojo.getWz_id());
                    while (!stopAll) {
                        try {
                            D19_tz.tz();
                            jLabel_JBSL2.setText(WZpojo.getWz_gold());
                            int tt = 0, aa = 0;
                                tt = Integer.parseInt(WZpojo.getTime_kj());
                                aa = Integer.parseInt(WZpojo.getTime_tz());
                            if (aa > 3600000) {
                                Thread.sleep(3600000);
                            }
                            else {
                                while (tt > 0) {
                                    if (stopAll) {
                                        return;
                                    }
                                    jLabel_TZDJS2.setText(aa + "");
                                    jLabel_KJDJS2.setText(tt + "");
                                    String value = console.getText();
                                    if (value.length() > 150) {
                                        console.removeAll();
                                    }
                                    if (aa == 0) {
                                        console.append("急速开始投注……\n");
                                        console.append("急速投注期号："
                                            + TZcontrol.TZqihao + "……\n");
                                        D19_tz.postData();
                                        Thread.sleep(1000);
                                        console.append("急速投注：\n"
                                            + TZcontrol.listjgs + "\n");
                                        console.append("急速投注结束……\n");
                                     
                                    }
                                    Thread.sleep(1000);
                                    tt--;
                                    aa--;
                                }
                                    console.append("急速开奖过程，开始睡眠，时间为6秒……\n");
                                    Thread.sleep(6000);
                                    console.append("急速睡眠结束……\n");
                            }
                        }catch (Exception e) {
                            e.printStackTrace();
                            try {
                                Thread.sleep(10000);
                            }
                            catch (InterruptedException e1) {
                                console.append("急速异常,休眠10秒……\n");
                            }
                        }
               
                    }
                }
            }
        }).start();
//        new Thread(new Runnable() {
//            public void run() {
//                if (WZpojo.getWz_State().equals("1")) {
//                    while (!stopAll) {
//                        try {
//                            D19_tz_jisu.tz();
//                            jLabel_JBSL2.setText(WZpojo.getWz_gold());
//                            int tt = 0, aa = 0;
//                            tt = Integer.parseInt(WZpojo.getTime_kj());
//                            aa = Integer.parseInt(WZpojo.getTime_tz());
//                            if (aa > 3600000) {
//                                Thread.sleep(3600000);
//                            }
//                            else {
//                                while (tt > 0) {
//                                    if (stopAll) {
//                                        return;
//                                    }
//                                    String value = console.getText();
//                                    if (value.length() > 150) {
//                                        console.removeAll();
//                                    }
//                                    if (aa == 0) {
//                                        console.append("幸运开始投注……\n");
//                                        if (CelueControl.checks()) {
//                                            console.append("急幸运投注期号："
//                                                + TZcontrol.TZqihao + "……\n");
//                                            D19_tz_jisu.postData();
//                                            console.append("幸运投注：\n"
//                                                + TZcontrol.listjgs + "\n");
//                                            console.append("幸运投注结束……\n");
//                                        }
//                                        else {
//                                            console.append("幸运策略：不进行投注……\n");
//                                        }
//                                    }
//                                    Thread.sleep(1000);
//                                    tt--;
//                                    aa--;
//                                }
//                                console.append("幸运开奖过程，开始睡眠，时间为60秒……\n");
//                                Thread.sleep(60000);
//                                console.append("幸运睡眠结束……\n");
//                            }
//                        }
//                        catch (Exception e) {
//                            try {
//                                e.printStackTrace();
//                                Thread.sleep(10000);
//                            }
//                            catch (InterruptedException e1) {
//                                console.append("幸运异常,休眠10秒……\n");
//                            }
//                        }
//                    }
//                }
//            }
//        }).start();
        new Thread(new Runnable() {
            public void run() {
                if (WZpojo.getWz_State().equals("1")) {
                    while (!stopAll) {
                        try {
                            D19_tz_fengkuang.tz();
                            jLabel_JBSL2.setText(WZpojo.getWz_gold());
                            int tt = 0, aa = 0;
                            tt = Integer.parseInt(WZpojo.getTime_kj());
                            aa = Integer.parseInt(WZpojo.getTime_tz());
                            if (aa > 3600000) {
                                Thread.sleep(3600000);
                            }
                            else {
                                while (tt > 0) {
                                    if (stopAll) {
                                        return;
                                    }
                                    String value = console.getText();
                                    if (value.length() > 150) {
                                        console.removeAll();
                                    }
                                    if (aa == 0) {
                                        console.append("疯狂开始投注……\n");
//                                        if (CelueControl.checks()) {
                                            console.append("疯狂投注期号："
                                                + TZcontrol.TZqihao + "……\n");
                                            D19_tz_fengkuang.postData();
                                            Thread.sleep(1000);
                                            console.append("疯狂投注：\n"
                                                + TZcontrol.listjgs + "\n");
                                            console.append("疯狂投注结束……\n");
//                                        }
//                                        else {
//                                            console.append("疯狂策略：不进行投注……\n");
//                                        }
                                    }
                                    Thread.sleep(1000);
                                    tt--;
                                    aa--;
                                }
                                console.append("疯狂开奖过程，开始睡眠，时间为20秒……\n");
                                Thread.sleep(10000);
                                console.append("疯狂睡眠结束……\n");
                            }
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                            try {
                                Thread.sleep(10000);
                            }
                            catch (InterruptedException e1) {
                                console.append("疯狂异常,休眠10秒……\n");
                            }
                        }
                        
                    }
                }
            }
        }).start();
    }
    
    private void endActionPerformed(ActionEvent evt) {
        btn_end.setVisible(false);
        btn_begin.setVisible(true);
        jLabel_YZM.setVisible(true);
        jText_YZM.setVisible(true);
        stopAll = true;
        jLabel_TZDJS2.setText(0 + "");
        jLabel_KJDJS2.setText(0 + "");
        getImgByWz();
        readImg();
    }
    
    /**
     * 
     * @Title: checkPT
     * @Description: 平台验证
     * @param 设定文件
     * @return void 返回类型
     * @throws
     */
    @SuppressWarnings("deprecation")
    public void checkPT() {
        PTpojo.setPt_name(jText_PT_username.getText());
        PTpojo.setPt_pass(jPass_PT_password.getText());
        String res =
            LoadImple.checkPT(PTpojo.getPt_name(), PTpojo.getPt_pass());
        console.append("开始验证平台信息……\n");
        if ("1".equals(res)) {
            console.append("登录平台成功……\n");
            PTpojo.setPt_State("1");
        }
        else {
            console.append("登录平台失败!请检查用户名或者密码是否正确……\n");
            PTpojo.setPt_State("0");
        }
    }
    
    /**
     * 
     * @Title: checkWZ
     * @Description: 网站验证
     * @param 设定文件
     * @return void 返回类型
     * @throws
     */
    @SuppressWarnings("deprecation")
    public void checkWZ() {
        WZpojo.setWz_tz_index(jCom_XZYX.getSelectedIndex() + "");
        if (jCom_PLSF.getSelectedIndex() != 0) {
            WZpojo.setSf_pl(true);
            WZpojo.setWz_sf_index(jCom_PLSF.getSelectedIndex() + "");
        }
        else {
            WZpojo.setSf_pl(false);
            WZpojo.setWz_sf_index(jCom_PTSF.getSelectedIndex() + "");
        }
        WZpojo.setWz_name(jText_WZ_username.getText());
        WZpojo.setWz_pass(jPass_WZ_password.getText());
        WZpojo.setWz_index(jCom_XZWZ.getSelectedIndex() + "");
        WZ_index = jCom_XZWZ.getSelectedIndex();
        WZpojo.setWz_code(jText_YZM.getText());
        String res = LoadImple.checkWZ(WZpojo.getWz_name(),
            WZpojo.getWz_pass(),
            jCom_XZWZ.getSelectedIndex() + "");
        console.append("开始登陆网站……\n");
        if ("1".equals(res)) {
            console.append("登录网站成功……\n");
            WZpojo.setWz_State("1");
        }
        else {
            console.append("登录网站失败!请检查用户名或者密码是否正确……\n");
            WZpojo.setWz_sf_index("0");
        }
    }
    
    public void setCeLue() {
        if (jText_gold_min.getText().length() > 0) {
            TZcelue.setGold_min(jText_gold_min.getText());
        }
        else {
            TZcelue.setGold_min("0");
        }
        if (jText_gold_max.getText().length() > 0) {
            TZcelue.setGold_max(jText_gold_max.getText());
        }
        else {
            TZcelue.setGold_max("99999999999");
        }
        if (jText_time_0.getText().length() > 0) {
            TZcelue.setTZ_0(jText_time_0.getText());
        }
        else {
            TZcelue.setTZ_0("99");
        }
        if (jText_time_20.getText().length() > 0) {
            TZcelue.setTZ_20(jText_time_20.getText());
        }
        else {
            TZcelue.setTZ_20("99");
        }
        if (jText_time_40.getText().length() > 0) {
            TZcelue.setTZ_40(jText_time_40.getText());
        }
        else {
            TZcelue.setTZ_40("99");
        }
        if (jText_time_60.getText().length() > 0) {
            TZcelue.setTZ_60(jText_time_60.getText());
        }
        else {
            TZcelue.setTZ_60("99");
        }
        if (jText_time_80.getText().length() > 0) {
            TZcelue.setTZ_80(jText_time_80.getText());
        }
        else {
            TZcelue.setTZ_80("99");
        }
        if (jText_time_100.getText().length() > 0) {
            TZcelue.setTZ_100(jText_time_100.getText());
        }
        else {
            TZcelue.setTZ_100("99");
        }
        if (jText_FB_1.getText().length() > 0) {
            TZcelue.setTZ_cs_1(jText_FB_1.getText());
        }
        else {
            TZcelue.setTZ_cs_1("1");
        }
        if (jText_FB_2.getText().length() > 0) {
            TZcelue.setTZ_cs_2(jText_FB_2.getText());
        }
        else {
            TZcelue.setTZ_cs_2("1");
        }
        if (jText_FB_3.getText().length() > 0) {
            TZcelue.setTZ_cs_3(jText_FB_3.getText());
        }
        else {
            TZcelue.setTZ_cs_3("1");
        }
        if (jText_FB_4.getText().length() > 0) {
            TZcelue.setTZ_cs_4(jText_FB_4.getText());
        }
        else {
            TZcelue.setTZ_cs_4("1");
        }
        if (jText_FB_5.getText().length() > 0) {
            TZcelue.setTZ_cs_5(jText_FB_5.getText());
        }
        else {
            TZcelue.setTZ_cs_5("1");
        }
        if (jText_FB_6.getText().length() > 0) {
            TZcelue.setTZ_cs_6(jText_FB_6.getText());
        }
        else {
            TZcelue.setTZ_cs_6("1");
        }
        if (jText_FB_7.getText().length() > 0) {
            TZcelue.setTZ_cs_7(jText_FB_7.getText());
        }
        else {
            TZcelue.setTZ_cs_7("1");
        }
        if (jText_FB_8.getText().length() > 0) {
            TZcelue.setTZ_cs_8(jText_FB_8.getText());
        }
        else {
            TZcelue.setTZ_cs_8("1");
        }
        if (jText_FB_9.getText().length() > 0) {
            TZcelue.setTZ_cs_9(jText_FB_9.getText());
        }
        else {
            TZcelue.setTZ_cs_9("1");
        }
        if (jText_FB_10.getText().length() > 0) {
            TZcelue.setTZ_cs_10(jText_FB_10.getText());
        }
        else {
            TZcelue.setTZ_cs_10("1");
        }
        if (jText_TZ_js_min.getText().length() > 0) {
            TZcelue.setTZ_js_min(jText_TZ_js_min.getText());
        }
        else {
            TZcelue.setTZ_js_min("0");
        }
        if (jText_TZ_js_max.getText().length() > 0) {
            TZcelue.setTZ_js_max(
                Integer.parseInt(jText_TZ_js_min.getText()) * 2 + "");
        }
        else {
            TZcelue.setTZ_js_max("1");
        }
        if (jText_QJ_GL.getText().length() > 0) {
            TZcelue.setTZ_qj(jText_QJ_GL.getText());
        }
        else {
            TZcelue.setTZ_qj("10000000");
        }
    }
    
    /**
     * 
     * @Title: getImgByWz
     * @Description: 获取验证码
     * @param 设定文件
     * @return void 返回类型
     * @throws
     */
    public void getImgByWz() {
        // 绘图时间
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (jCom_XZWZ.getSelectedIndex() == 0) {
            
        }
        else if (jCom_XZWZ.getSelectedIndex() == 1) {
            Loading19D.getImg();
        }
        else if (jCom_XZWZ.getSelectedIndex() == 2 || Config.XZWZ.equals("2")) {
            loadingXM.getImg();
        }
        else if (jCom_XZWZ.getSelectedIndex() == 3 || Config.XZWZ.equals("3")) {
            LoadingBT.getImg();
        }
    }
    
    public void readImg() {
        // 新梦图片特殊
        Image img = null;
        if (jCom_XZWZ.getSelectedIndex() == 2 || Config.XZWZ.equals("2")||jCom_XZWZ.getSelectedIndex() == 3 || Config.XZWZ.equals("3")) {
            img = Toolkit.getDefaultToolkit().createImage("C.bmp");
        }
        else {
            img = Toolkit.getDefaultToolkit().createImage("C.png");
        }
        ImageIcon icon = new ImageIcon(img);
        if (icon.getIconWidth() != -1) {
            jLabel_YZM.setSize(icon.getIconWidth(), icon.getIconHeight());
            jLabel_YZM.setIcon(icon);
        }
        else {
            jLabel_YZM.setIcon(null);
            jLabel_YZM.setText("验证失败");
        }
    }
}
