package j.tool;

import j.fs.JDFSFile;
import j.util.JUtilImage;
import j.util.JUtilString;

import java.io.File;

/**
 * 
 * @author 肖炯
 *
 */
public class FileReplace {
	private static int count=0;
	
	/**
	 * 		
	 */
	public FileReplace() {
	}

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args)throws Exception{
//		File file=new File("F:\\temp\\catalogs.txt");
//		String s=JDFSFile.read(file,"UTF-8");
//		
//		int order=20000;
//		
//		int start=s.indexOf("<h3 title=\"")+"<h3 title=\"".length();
//		int end=s.indexOf("\"",start);
//		while(start>"<h3 title=\"".length()){			
//			String catLevel1=s.substring(start,end);
//			//System.out.println(catLevel1);
//			//String groupIdLevle1=JUtilString.randomStr(10);
//			
//			System.out.println("INSERT INTO `js_catalog` VALUES ('"+order+"',2400,'',NULL,NULL,'"+catLevel1+"','','','iconfont icon-jinkou1','',NULL,"+order+",'T','<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>');");
//			int catIdLevel1=order;
//			order++;
//			
//			int start2=s.indexOf("floor_c_title",start);
//			int end2=s.indexOf("</p>",start2);
//			
//			int end2Max=s.indexOf("floor js-floor",end);
//			if(end2Max<end||end2Max<0) break;
//			
//			while(start2>0&&end2>start2&&end2<end2Max){
//				start2=s.indexOf(">",start2)+1;
//				String catLevel2=s.substring(start2,end2);
//				catLevel2=JUtilString.replaceAll(catLevel2,"\r","");
//				catLevel2=JUtilString.replaceAll(catLevel2,"\n","");
//				catLevel2=JUtilString.replaceAll(catLevel2,"\t","");
//				catLevel2=JUtilString.replaceAll(catLevel2," ","");
//				
//				//String groupIdLevle2=JUtilString.randomStr(10);
//				//System.out.println("\tINSERT INTO `js_catalog` VALUES ('"+groupIdLevle2+"','478932345981','"+groupIdLevle1+"','"+catLevel2+"','','2008-08-08 08:08:08',"+(order++)+",'');");
//				System.out.println("\tINSERT INTO `js_catalog` VALUES ('"+order+"',2400,'"+catIdLevel1+"',NULL,NULL,'"+catLevel2+"','','','','',NULL,"+order+",'T','<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>');");
//				int catIdLevel2=order;
//				order++;
//				
//				int start3=s.indexOf("<dt",start2);
//				int end3=s.indexOf("</dt>",start3);
//				
//				int end3Max=s.indexOf("floor_c_con",end2);
//				if(end3Max<end2||end3Max<0) break;
//				while(start3>0&&end3>start3&&end3<end3Max){
//					start3=s.indexOf(">",start3)+1;
//					String catLevel3=s.substring(start3,end3);
//					catLevel3=JUtilString.replaceAll(catLevel3,"\r","");
//					catLevel3=JUtilString.replaceAll(catLevel3,"\n","");
//					catLevel3=JUtilString.replaceAll(catLevel3,"\t","");
//					catLevel3=JUtilString.replaceAll(catLevel3," ","");
//					//System.out.println(catLevel1+">>"+catLevel2+">>"+catLevel3);
//					
//					//String groupIdLevle3=JUtilString.randomStr(10);
//					//System.out.println("\t\tINSERT INTO `js_catalog` VALUES ('"+groupIdLevle3+"','478932345981','"+groupIdLevle2+"','"+catLevel3+"','','2008-08-08 08:08:08',"+(order++)+",'');");
//					System.out.println("\t\tINSERT INTO `js_catalog` VALUES ('"+order+"',2400,'"+catIdLevel2+"',NULL,NULL,'"+catLevel3+"','','','','',NULL,"+order+",'T','<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>');");
//					order++;
//
//					start3=s.indexOf("<dt",end3);
//					end3=s.indexOf("</dt>",start3);
//				}
//				
//				start2=s.indexOf("floor_c_title",end2);
//				end2=s.indexOf("</p>",start2);
//			}
//			
//			start=s.indexOf("<h3 title=\"",end)+"<h3 title=\"".length();
//			end=s.indexOf("\"",start);
//		}
		
		File dir=new File("F:\\work\\JShop_v2.1\\WebContent\\WEB-INF\\pages");
		replace(dir,
				"古古商贸",
				"迅捷能源",
				".jsp");
		
//		rotate(new File("D:\\176\\10.4 桃江一中 活动\\形象照\\temp"),180,".jpg");
		
//		count(dir,
//		"gugu",
//		".java");
		
//		File root=new File("F://tempx/");
//		File[] children=(File[])root.listFiles();
//		for(int i=0;i<children.length;i++){
//			delete(children[i]);
//		}
//		
//		System.out.println(count);
//		
//		File dir=new File("F:\\work\\JShop_v2.1\\WebContent\\WEB-INF\\pages");
//		replace(dir,"未指定支付订单ID","未指定支付编号",".jsp");
		System.exit(0);
	}
	
	private static boolean delete(File file){
		if(!file.isDirectory()) return false;
		
		File[] children=(File[])file.listFiles();
		if(children==null||children.length==0){
			System.out.println("delete....."+file.getAbsolutePath());
			file.delete();
			return true;
		}
		
		for(int i=0;i<children.length;i++){
			delete(children[i]);
		}
		
		return false;
	}
	
	/**
	 * 
	 * @param file
	 * @param src
	 * @param alt
	 */
	private static void replace(File file,String src,String alt,String ext){
		if(file.isDirectory()){
			File[] fs=file.listFiles();
			for(int i=0;i<fs.length;i++){
				replace(fs[i],src,alt,ext);
			}
		}else{
			if(!file.getName().endsWith(ext)) return;
			
			String s=JDFSFile.read(file, "UTF-8");
			
//			int start=s.indexOf("class=\"searcher\"");
//			int end=0;
//			if(start>0) {
//				end=s.indexOf("</form>",start);
//			}
//			if(end>0&&end>start) {
//				String s1=s.substring(0,start);
//				String s2=s.substring(start,end);
//				String s3=s.substring(end);
//				if(s2.indexOf("<div class=\"btnLongLight marginL10\">")>0) {
//					s2=JUtilString.replaceAll(s2, "<div class=\"btnLongLight marginL10\">", "<div class=\"btnSmall65 marginL10\">");
//					s=s1+s2+s3;
//					JDFSFile.saveString(file.getAbsolutePath(), s, false, "UTF-8");
//					
//					System.out.println(file.getAbsolutePath());
//				}
//			}
			
			if(s.indexOf(src)>-1){
				
				s=JUtilString.replaceAll(s, src, alt);
				
				JDFSFile.saveString(file.getAbsolutePath(), s, false, "UTF-8");
				
				System.out.println(file.getAbsolutePath());
			}
		}		
	}
	
	/**
	 * 
	 * @param file
	 * @param ext
	 */
	private static void resize(File file,String ext){
		if(file.isDirectory()){
			File[] fs=file.listFiles();
			for(int i=0;i<fs.length;i++){
				resize(fs[i],ext);
			}
		}else{
			if(!file.getName().toLowerCase().endsWith(ext)) return;
			
			JUtilImage im = new JUtilImage();
			im.setQuality(0.9f);
			
			try {
				im.zoomToSize(file, file, 1920, JUtilImage.FORMAT_JPEG);
			}catch(Exception e) {}
			
			System.out.println(file.getAbsolutePath());
		}		
	}
	
	private static void rotate(File file,int angel, String ext){
		if(file.isDirectory()){
			File[] fs=file.listFiles();
			for(int i=0;i<fs.length;i++){
				rotate(fs[i], angel, ext);
			}
		}else{
			if(!file.getName().toLowerCase().endsWith(ext)) return;
			
			JUtilImage im = new JUtilImage();
			im.setQuality(1f);
			
			try {
				im.rotate(file, file, angel, JUtilImage.FORMAT_JPEG);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(file.getAbsolutePath());
		}		
	}
	
	
	/**
	 * 
	 * @param file
	 * @param src
	 */
	private static void count(File file,String src,String ext){
		if(file.isDirectory()){
			File[] fs=file.listFiles();
			for(int i=0;i<fs.length;i++){
				count(fs[i],src,ext);
			}
		}else{
			if(!file.getName().endsWith(ext)) return;
			
			
			String s=JDFSFile.read(file, "UTF-8");
			if(s==null) return;
			
			
			
			count+=(s.indexOf(src)>-1?1:0);
			System.out.println(file.getAbsolutePath()+","+count);
		}		
	}
}
