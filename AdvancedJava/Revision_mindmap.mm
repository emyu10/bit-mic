<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node COLOR="#000000" CREATED="1573616286117" ID="ID_1161789306" MODIFIED="1573623689412" STYLE="fork" TEXT="Advance Programming in Java">
<node CREATED="1573616409386" ID="ID_417755403" MODIFIED="1573623654501" POSITION="right" TEXT="1. Graphics Programming">
<node CREATED="1573616742377" ID="ID_697600504" MODIFIED="1573623654501" TEXT="Abstract Window Toolkit (AWT)">
<node CREATED="1573617087191" ID="ID_637448070" MODIFIED="1573623654501" TEXT="Intro">
<node CREATED="1573617102167" ID="ID_1964828031" MODIFIED="1573623654502" TEXT="Heavy weight"/>
<node CREATED="1573617111047" ID="ID_233862675" MODIFIED="1573623654502" TEXT="Platform dependant UI elements"/>
<node CREATED="1573617123150" ID="ID_1308400495" MODIFIED="1573623654502" TEXT="Looks and feels like the underlying OS"/>
</node>
<node CREATED="1573617313901" ID="ID_1536495360" MODIFIED="1573623654502" TEXT="Pros">
<node CREATED="1573617317637" ID="ID_203332062" MODIFIED="1573623654502" TEXT="Speed"/>
<node CREATED="1573617324732" ID="ID_302082010" MODIFIED="1573623654503" TEXT="Applet Portability"/>
<node CREATED="1573617338877" ID="ID_293210211" MODIFIED="1573623654503" TEXT="Look and Feel"/>
</node>
<node CREATED="1573617347389" ID="ID_872519808" MODIFIED="1573623654503" TEXT="Cons">
<node CREATED="1573617615131" ID="ID_1715160033" MODIFIED="1573623654503" TEXT="Portability"/>
<node CREATED="1573617621547" ID="ID_1371558081" MODIFIED="1573623654503" TEXT="Third Party Development"/>
<node CREATED="1573617632267" ID="ID_1340647194" MODIFIED="1573623654504" TEXT="Features"/>
</node>
<node CREATED="1573617839554" ID="ID_1047525322" MODIFIED="1573623654504" TEXT="Hierarchy">
<node CREATED="1573617847393" ID="ID_1297160797" MODIFIED="1573623654504" TEXT="Component">
<node CREATED="1573617854809" ID="ID_1503076398" MODIFIED="1573623654504" TEXT="Container">
<node CREATED="1573617893665" ID="ID_105839650" MODIFIED="1573623654504" TEXT="Window">
<node CREATED="1573617905065" ID="ID_1526668266" MODIFIED="1573623654504" TEXT="Frame"/>
<node CREATED="1573617909289" ID="ID_1296883683" MODIFIED="1573623654505" TEXT="Dialog"/>
</node>
<node CREATED="1573617897921" ID="ID_1616538514" MODIFIED="1573623654505" TEXT="Panel">
<node CREATED="1573617915889" ID="ID_1183409012" MODIFIED="1573623654505" TEXT="Applet"/>
</node>
</node>
<node CREATED="1573617862489" ID="ID_1190481031" MODIFIED="1573623654505" TEXT="Button"/>
<node CREATED="1573617866777" ID="ID_474662305" MODIFIED="1573623654505" TEXT="Label"/>
<node CREATED="1573617870185" ID="ID_235583435" MODIFIED="1573623654505" TEXT="Checkbox"/>
<node CREATED="1573617876049" ID="ID_1276309242" MODIFIED="1573623654506" TEXT="Choice"/>
<node CREATED="1573617882905" ID="ID_1388815847" MODIFIED="1573623654506" TEXT="Scrollbar"/>
</node>
<node CREATED="1573622086669" ID="ID_1862655106" MODIFIED="1573623654506" TEXT="Components and Containers">
<node CREATED="1573622105430" ID="ID_1803294568" MODIFIED="1573623654506" TEXT="buttons, text fields, scrollbars"/>
<node CREATED="1573622126573" ID="ID_833620227" MODIFIED="1573623654506" TEXT="add elements to containers to position them on screen"/>
<node CREATED="1573622175157" ID="ID_1766726696" MODIFIED="1573623654506" TEXT="container is a component"/>
<node CREATED="1573622194045" ID="ID_730418557" MODIFIED="1573623654507" TEXT="Types">
<font NAME="SansSerif" SIZE="12"/>
<node CREATED="1573622225197" ID="ID_1587514183" MODIFIED="1573623654507" TEXT="Window">
<node CREATED="1573622244284" ID="ID_530736106" MODIFIED="1573623654507" TEXT="no border, no title"/>
</node>
<node CREATED="1573622261596" ID="ID_613110385" MODIFIED="1573623654507" TEXT="Dialog">
<node CREATED="1573622309748" ID="ID_979334224" MODIFIED="1573623654507" TEXT="has border and title"/>
<node CREATED="1573622326819" ID="ID_1000727424" MODIFIED="1573623654508" TEXT="cannot exist without a parent component"/>
</node>
<node CREATED="1573622422931" ID="ID_404773489" MODIFIED="1573623654508" TEXT="Panel">
<node CREATED="1573622430139" ID="ID_1836953248" MODIFIED="1573623654508" TEXT="no title bar, menu bar or border"/>
<node CREATED="1573622452739" ID="ID_159934554" MODIFIED="1573623654508" TEXT="generic container for holding other components"/>
</node>
<node CREATED="1573622489635" ID="ID_1605317978" MODIFIED="1573623654508" TEXT="Frame">
<node CREATED="1573622493347" ID="ID_1055971361" MODIFIED="1573623654509" TEXT="has title, border and menu bars"/>
<node CREATED="1573622508251" ID="ID_355484636" MODIFIED="1573623654509" TEXT="can contain other components"/>
<node CREATED="1573622533162" ID="ID_1787267478" MODIFIED="1573623654509" TEXT="widely used in developing AWT applications"/>
</node>
</node>
<node CREATED="1573622602914" ID="ID_1199775198" MODIFIED="1573623654509" TEXT="Component - some methods">
<node CREATED="1573622626066" ID="ID_367286889" MODIFIED="1573623654509" TEXT="boolean isVisible()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622713185" ID="ID_1807894344" MODIFIED="1573623654510" TEXT="void setVisible(boolean)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622726401" ID="ID_505775784" MODIFIED="1573623654510" TEXT="boolean isShowing()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622801665" ID="ID_459837523" MODIFIED="1573623654510" TEXT="boolean isEnabled()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622811249" ID="ID_329230131" MODIFIED="1573623654510" TEXT="void setEnabled(boolean)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622831553" ID="ID_312356541" MODIFIED="1573623654510" TEXT="Point getLocation()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622839776" ID="ID_967781527" MODIFIED="1573623654510" TEXT="Point getLocationOnScreen()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622854552" ID="ID_821147450" MODIFIED="1573623654511" TEXT="void setBounds(int, int, int, int)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622886640" ID="ID_322350912" MODIFIED="1573623654511" TEXT="void setLocation(int, int)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622895872" ID="ID_1732459772" MODIFIED="1573623654511" TEXT="void setLocation(Point)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622950896" ID="ID_1858435722" MODIFIED="1573623654511" TEXT="Dimension getSize()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622958296" ID="ID_1349334531" MODIFIED="1573623654511" TEXT="void setSize(int, int)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573622969375" ID="ID_1526426375" MODIFIED="1573623654511" TEXT="void setSize(Dimension)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
<node CREATED="1573623068127" ID="ID_1185124679" MODIFIED="1573623654511" TEXT="Window - some methods">
<node CREATED="1573623074919" ID="ID_616807378" MODIFIED="1573623654511" TEXT="void toFront()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573623096407" ID="ID_875509435" MODIFIED="1573623654511" TEXT="void toBack()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
<node CREATED="1573623119630" ID="ID_1734588773" MODIFIED="1573623654511" TEXT="Frame - some methods">
<node CREATED="1573623126910" ID="ID_1490452159" MODIFIED="1573623654512" TEXT="void setResizable(boolean)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573623143678" ID="ID_823681250" MODIFIED="1573623654512" TEXT="void setTitle(String)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573623219534" ID="ID_803179913" MODIFIED="1573623654512" TEXT="void setIconImage(Image)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
<node CREATED="1573623240918" ID="ID_1973035459" MODIFIED="1573623654512" TEXT="Toolkit - some methods">
<node CREATED="1573623248885" ID="ID_1217715999" MODIFIED="1573623654512" TEXT="Dimension getScreenSize()">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573623267510" ID="ID_121383771" MODIFIED="1573623654512" TEXT="Image getImage(String)">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
</node>
</node>
</node>
<node CREATED="1573616749801" ID="ID_639961016" MODIFIED="1573623654512" TEXT="Swing">
<node CREATED="1573617150518" ID="ID_1506239477" MODIFIED="1573623654512" TEXT="Intro">
<node CREATED="1573617154862" ID="ID_1463998214" MODIFIED="1573623654512" TEXT="Lighter"/>
<node CREATED="1573617162342" ID="ID_1158950929" MODIFIED="1573623654512" TEXT="Platform independant"/>
<node CREATED="1573617171094" ID="ID_791529085" MODIFIED="1573623654512" TEXT="Looks and feels the same across any OS"/>
</node>
<node CREATED="1573617682043" ID="ID_1753340300" MODIFIED="1573623654512" TEXT="Pros">
<node CREATED="1573617686403" ID="ID_1893153705" MODIFIED="1573623654512" TEXT="Portability"/>
<node CREATED="1573617692195" ID="ID_1408039498" MODIFIED="1573623654513" TEXT="Behavior"/>
<node CREATED="1573617698963" ID="ID_140013548" MODIFIED="1573623654513" TEXT="Features"/>
<node CREATED="1573617705027" ID="ID_1512564207" MODIFIED="1573623654513" TEXT="Vendor Support"/>
<node CREATED="1573617714138" ID="ID_724152122" MODIFIED="1573623654513" TEXT="Look and Feel"/>
</node>
<node CREATED="1573617721034" ID="ID_681381973" MODIFIED="1573623654513" TEXT="Cons">
<node CREATED="1573617724202" ID="ID_71591883" MODIFIED="1573623654513" TEXT="Applet Portability"/>
<node CREATED="1573617733010" ID="ID_1344710554" MODIFIED="1573623654513" TEXT="Performance"/>
<node CREATED="1573617737754" ID="ID_1987137348" MODIFIED="1573623654513" TEXT="Look and Feel"/>
</node>
<node CREATED="1573623350989" ID="ID_150611380" MODIFIED="1573623654513" TEXT="JFrame">
<node CREATED="1573623364165" ID="ID_734641748" MODIFIED="1573623654513" TEXT="javax.swing.JFrame"/>
<node CREATED="1573623380789" ID="ID_149756796" MODIFIED="1573623654513" TEXT="inherits from java.awt.Frame"/>
<node CREATED="1573623393941" ID="ID_346242128" MODIFIED="1573623654513" TEXT="works like the main window"/>
<node CREATED="1573623409805" ID="ID_1913692633" MODIFIED="1573623654513" TEXT="can contain labels, buttons, text fields"/>
<node CREATED="1573623498300" ID="ID_1897538321" MODIFIED="1573623654514" TEXT="can hide or close with setDefaultCloseOperation(int)">
<font NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1573912345392" ID="ID_1585354410" MODIFIED="1573912358257" TEXT="constructors">
<node CREATED="1573912359372" ID="ID_45859661" MODIFIED="1573912381751" TEXT="JFrame() - new frame, initially invisible"/>
<node CREATED="1573912383891" ID="ID_1586007788" MODIFIED="1573912442679" TEXT="JFrame(GraphicsConfigureation) - with specific GraphicsConfiguration, blank title"/>
<node CREATED="1573912445635" ID="ID_1971609701" MODIFIED="1573912617318" TEXT="JFrame(String) - with title, initially invisible"/>
<node CREATED="1573912582162" ID="ID_191809830" MODIFIED="1573912612389" TEXT="JFrame(String, GraphicsConfiguration) - with title and GraphicsConfiguration"/>
</node>
<node CREATED="1573912678186" ID="ID_1335753359" MODIFIED="1573912682381" TEXT="useful methods">
<node CREATED="1573912683537" ID="ID_825714072" MODIFIED="1573912731094" TEXT="protected void frameInit() - called by the constructors to init the JFrame properly"/>
<node CREATED="1573912714322" ID="ID_1427818663" MODIFIED="1573912754813" TEXT="void setContentPane(Container) - sets the contentPane property"/>
<node CREATED="1573912756233" ID="ID_1148629370" MODIFIED="1573912831860" TEXT="static void setDefaultLookAndFeelDecorated(boolean) - should new JFrames have window decorations provided by the current look and feel"/>
<node CREATED="1573912836784" ID="ID_605987672" MODIFIED="1573912870524" TEXT="void setIconImage(Image) - sets app icon image"/>
<node CREATED="1573912872080" ID="ID_263249432" MODIFIED="1573912900652" TEXT="void setJMenuBar(JMenuBar) - sets a menu bar for the window"/>
<node CREATED="1573912902296" ID="ID_1447395124" MODIFIED="1573912933244" TEXT="void setLayeredPane(JLayeredPane) - sets layeredPane property"/>
</node>
<node CREATED="1573912983952" ID="ID_757804734" MODIFIED="1573912989322" TEXT="Frame positioning">
<node CREATED="1573913042831" ID="ID_1733205363" MODIFIED="1573913059683" TEXT="for working with size and position"/>
<node CREATED="1573913061279" ID="ID_1175002112" MODIFIED="1573913073443" TEXT="comes inheriting from Frame class">
<node CREATED="1573913075519" ID="ID_172550532" MODIFIED="1573913100211" TEXT="dispose() - closes the window"/>
<node CREATED="1573913101591" ID="ID_127301752" MODIFIED="1573913141907" TEXT="setIconImage(Image) - to set window icon"/>
<node CREATED="1573913168574" ID="ID_388695753" MODIFIED="1573913184778" TEXT="setTitle(String) - sets the title of the window"/>
<node CREATED="1573913231126" ID="ID_1124465090" MODIFIED="1573913257810" TEXT="setResizable(boolean) - should a frame be resizable or not"/>
</node>
<node CREATED="1573913417813" ID="ID_984101864" MODIFIED="1573913740376" TEXT="look for Component and Window class methods">
<node CREATED="1573913776059" ID="ID_206000157" MODIFIED="1573913790175" TEXT="show() method in Window class to display the frame"/>
<node CREATED="1573913792210" ID="ID_1442900056" MODIFIED="1573913810983" TEXT="setLocation(x, y) method in Component class"/>
<node CREATED="1573913825682" ID="ID_604575667" MODIFIED="1573913845527" TEXT="setBounds(x, y, width, height) method in Component class"/>
</node>
<node CREATED="1573913892586" ID="ID_1317582024" MODIFIED="1573913915070" TEXT="frames that are not explicitly sized will be 0px by 0px"/>
<node CREATED="1573913985762" ID="ID_497520679" MODIFIED="1573914019045" TEXT="check the display size at runtime to size frames suitably"/>
</node>
</node>
<node CREATED="1573914046121" ID="ID_47284291" MODIFIED="1573914064565" TEXT="Hierarchy">
<node CREATED="1573914067689" ID="ID_384274872" MODIFIED="1573914069725" TEXT="Object">
<node CREATED="1573914070905" ID="ID_628687365" MODIFIED="1573914076765" TEXT="Component">
<node CREATED="1573914083025" ID="ID_680516356" MODIFIED="1573914086300" TEXT="Container">
<node CREATED="1573914143024" ID="ID_1574366063" MODIFIED="1573914145565" TEXT="Window">
<node CREATED="1573914153352" ID="ID_1302224528" MODIFIED="1573914156596" TEXT="Frame">
<node CREATED="1573924612996" ID="ID_316762496" MODIFIED="1573924614912" TEXT="JFrame"/>
</node>
<node CREATED="1573914158336" ID="ID_1051411941" MODIFIED="1573914162725" TEXT="Dialog">
<node CREATED="1573924605260" ID="ID_1433487456" MODIFIED="1573924608264" TEXT="JDialog"/>
</node>
</node>
<node CREATED="1573914087736" ID="ID_618603917" MODIFIED="1573914093989" TEXT="JComponent">
<node CREATED="1573914097161" ID="ID_980466301" MODIFIED="1573914099285" TEXT="JLabel"/>
<node CREATED="1573914100777" ID="ID_114002536" MODIFIED="1573914103397" TEXT="JList"/>
<node CREATED="1573914104689" ID="ID_1336511933" MODIFIED="1573914108101" TEXT="JTable"/>
<node CREATED="1573914109361" ID="ID_550187953" MODIFIED="1573914114069" TEXT="JComboBox"/>
<node CREATED="1573914115369" ID="ID_1928078764" MODIFIED="1573914119029" TEXT="JSlider"/>
<node CREATED="1573914120313" ID="ID_1261339992" MODIFIED="1573924508736" TEXT="JMenuBar"/>
<node CREATED="1573924453389" ID="ID_1019845431" MODIFIED="1573924456561" TEXT="JText">
<node CREATED="1573924478501" ID="ID_7376657" MODIFIED="1573924482297" TEXT="JTextField"/>
<node CREATED="1573924483868" ID="ID_114450524" MODIFIED="1573924488400" TEXT="JTextArea"/>
</node>
<node CREATED="1573924520269" ID="ID_1472581273" MODIFIED="1573924525064" TEXT="JOptionPane"/>
<node CREATED="1573924535260" ID="ID_1084210593" MODIFIED="1573924537680" TEXT="JPanel"/>
<node CREATED="1573924544780" ID="ID_277819093" MODIFIED="1573924547952" TEXT="JScrollBar"/>
<node CREATED="1573914124889" ID="ID_1230472107" MODIFIED="1573914129797" TEXT="AbstractButton">
<node CREATED="1573914131697" ID="ID_305702130" MODIFIED="1573914134012" TEXT="JButton"/>
</node>
</node>
</node>
</node>
</node>
</node>
</node>
<node CREATED="1573924716739" ID="ID_653862435" MODIFIED="1573924719943" TEXT="Graphics">
<node CREATED="1573924737291" ID="ID_1097761674" MODIFIED="1573924744327" TEXT="java.awt.Graphics">
<node CREATED="1573924749299" ID="ID_1552983504" MODIFIED="1573924776287" TEXT="public abstract void drawString(String, int, int)"/>
<node CREATED="1573924778139" ID="ID_533502144" MODIFIED="1573924806831" TEXT="public void drawRect(int x, int y, int w, int h)"/>
<node CREATED="1573924811850" ID="ID_1231850456" MODIFIED="1573924954054" TEXT="public abstract void fillRect(int x, int y, int w, int h)"/>
<node CREATED="1573924870498" ID="ID_645829640" MODIFIED="1573924927398" TEXT="public abstract void drawOval(int x, int y, int w, int h)"/>
<node CREATED="1573924969404" ID="ID_1126160907" MODIFIED="1573924987373" TEXT="public abstract void fillOval(int x, int y, int w, int h)"/>
<node CREATED="1573924988889" ID="ID_1058533780" MODIFIED="1573925027381" TEXT="public abstract void drawLine(int x1, int y1, int x2, int x2)"/>
<node CREATED="1573925029993" ID="ID_1544265813" MODIFIED="1573925055533" TEXT="public abstract void drawImage(Image i, int x, int y)"/>
<node CREATED="1573925057841" ID="ID_994986967" MODIFIED="1573925149301" TEXT="public abstract void drawArc(int x, int y, int w, int h, int sA, int aA)"/>
<node CREATED="1573925102449" ID="ID_915586287" MODIFIED="1573925140669" TEXT="public abstract void fillArc(int x, int y, int w, int h, int sA, int aA)"/>
<node CREATED="1573925169905" ID="ID_77537046" MODIFIED="1573925185284" TEXT="public abstract void setColor(Color c)"/>
<node CREATED="1573925187288" ID="ID_671799976" MODIFIED="1573925201372" TEXT="public abstract void setFont(Font f)"/>
</node>
<node CREATED="1573925437143" ID="ID_1612017761" MODIFIED="1573925446091" TEXT="java.awt.Canvas">
<node CREATED="1573925447255" ID="ID_999908848" MODIFIED="1573925464947" TEXT="use this class to paint the Graphics"/>
</node>
<node CREATED="1573925515118" ID="ID_1845986485" MODIFIED="1573925518522" TEXT="Colors">
<node CREATED="1573925568582" ID="ID_928393252" MODIFIED="1573925605570" TEXT="java.awt.Color">
<node CREATED="1573925636750" ID="ID_1706043857" MODIFIED="1573925652338" TEXT="java.awt.Graphics">
<node CREATED="1573925676629" ID="ID_713288643" MODIFIED="1573925706113" TEXT="setColor(Color c) - changes the current color"/>
</node>
<node CREATED="1573925654766" ID="ID_383720819" MODIFIED="1573925663594" TEXT="java.awt.Graphics2D">
<node CREATED="1573925718173" ID="ID_1419286296" MODIFIED="1573925759625" TEXT="void setPaint(Paint p) - sets the paint attribute"/>
<node CREATED="1573925762085" ID="ID_1901944142" MODIFIED="1573925771953" TEXT="Color class implements the Paint interface"/>
</node>
<node CREATED="1573925665070" ID="ID_1761319781" MODIFIED="1573925674785" TEXT="java.awt.Component">
<node CREATED="1573925776901" ID="ID_1719403515" MODIFIED="1573925792617" TEXT="void setBackground(Color c) - sets background color"/>
<node CREATED="1573925794389" ID="ID_1799442798" MODIFIED="1573925809825" TEXT="void setForeground(Color c) - sets foreground color"/>
</node>
</node>
</node>
</node>
<node CREATED="1573925883804" ID="ID_1707593273" MODIFIED="1573925887808" TEXT="Text and Fonts">
<node CREATED="1573925986620" ID="ID_710676104" MODIFIED="1573925998639" TEXT="specify font by its font face name"/>
<node CREATED="1573926015539" ID="ID_1552348196" MODIFIED="1573926024975" TEXT="example: Helvetica Bold"/>
<node CREATED="1573926038779" ID="ID_736066610" MODIFIED="1573926098319" TEXT="to get available fonts - String[] GraphicsEnvironment.getAvailableFontFamilyNames()"/>
<node CREATED="1573926169091" ID="ID_306176694" MODIFIED="1573926220110" TEXT="to get current GraphicsEnvironment - GraphicsEnvironment GraphicsEnvironment.getLocalGraphicsEnvironment()"/>
<node CREATED="1573926282178" ID="ID_1044340843" MODIFIED="1573926289734" TEXT="common baseline fonts">
<node CREATED="1573926290665" ID="ID_693341353" MODIFIED="1573926295158" TEXT="SansSerif">
<node CREATED="1573926330234" ID="ID_824005561" MODIFIED="1573926341950" TEXT="on Windows, mapped to Arial"/>
</node>
<node CREATED="1573926296578" ID="ID_1070640403" MODIFIED="1573926300277" TEXT="Serif"/>
<node CREATED="1573926301514" ID="ID_1300967854" MODIFIED="1573926305542" TEXT="Monospaced"/>
<node CREATED="1573926306954" ID="ID_13945482" MODIFIED="1573926309694" TEXT="Dialog"/>
<node CREATED="1573926311586" ID="ID_526612110" MODIFIED="1573926316030" TEXT="DialogInput"/>
</node>
<node CREATED="1573926474321" ID="ID_60421781" MODIFIED="1573926558548" TEXT="create an object of class Font by specifying">
<node CREATED="1573926494041" ID="ID_1054231947" MODIFIED="1573926500213" TEXT="font name"/>
<node CREATED="1573926501841" ID="ID_53219815" MODIFIED="1573926506428" TEXT="font style">
<node CREATED="1573926573288" ID="ID_853479957" MODIFIED="1573926579540" TEXT="Font.PLAIN"/>
<node CREATED="1573926581304" ID="ID_1236594335" MODIFIED="1573926588844" TEXT="Font.BOLD"/>
<node CREATED="1573926590232" ID="ID_207422165" MODIFIED="1573926596124" TEXT="Font.ITALIC"/>
</node>
<node CREATED="1573926536777" ID="ID_320083918" MODIFIED="1573926541477" TEXT="point size"/>
</node>
</node>
</node>
<node CREATED="1573616421049" ID="ID_1730170301" MODIFIED="1573623654514" POSITION="left" TEXT="2. Event Handling"/>
<node CREATED="1573616459521" ID="ID_1538216105" MODIFIED="1573623654514" POSITION="right" TEXT="3. User Interface Components with Swing"/>
<node CREATED="1573616483903" ID="ID_1623269740" MODIFIED="1573623654514" POSITION="left" TEXT="4. User Interface Components with Swing II"/>
<node CREATED="1573616596012" ID="ID_21910840" MODIFIED="1573623654514" POSITION="right" TEXT="5. Applets"/>
<node CREATED="1573616607371" ID="ID_1165599461" MODIFIED="1573623654514" POSITION="left" TEXT="6. Advanced Swing"/>
<node CREATED="1573616633419" ID="ID_206567052" MODIFIED="1573623654514" POSITION="right" TEXT="7. Database Connectivity JDBC"/>
<node CREATED="1573616650978" ID="ID_853067297" MODIFIED="1573623654514" POSITION="left" TEXT="8. Database Connectivity JDBC II"/>
</node>
</map>
