package j.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * 
 * @author 肖炯
 * 
 */
public class JUtilZip {
	/**
	 * 
	 * 
	 */
	public JUtilZip() {
	}

	/**
	 * 
	 * @param zipFilePath
	 * @param outPath
	 * @param password
	 */
	public static void extractZipFile(String zipFilePath, String outPath,
			String password) {
		// TODO
	}

	/**
	 * 将dirPath及其子目录和文件压缩为destFile
	 * 
	 * @param dir
	 * @param destFile
	 * @throws Exception
	 */
	public static void createZipFile(String dirPath, String destFile)
			throws Exception {
		// TODO
	}

	/**
	 * 解压gzip流为byte[]
	 * 
	 * @param in
	 * @return
	 * @throws Exception
	 */
	public static byte[] readGZipStream2Bytes(InputStream in) throws Exception {
		GZIPInputStream gzin = new GZIPInputStream(in);
		return JUtilInputStream.bytes(gzin);
	}

	/**
	 * 解压gzip流为String
	 * 
	 * @param in
	 * @return
	 * @throws Exception
	 */
	public static String readGZipStream2String(InputStream in) throws Exception {
		return new String(readGZipStream2Bytes(in));
	}

	/**
	 * 解压gzip流为指定编码的String
	 * 
	 * @param in
	 * @return
	 * @throws Exception
	 */
	public static String readGZipStream2String(InputStream in, String encoding)
			throws Exception {
		return new String(readGZipStream2Bytes(in), encoding);
	}

	/**
	 * 解压gzip流并写入文件
	 * 
	 * @param in
	 * @param file
	 * @throws Exception
	 */
	public static void gzipIs2File(InputStream in, String file)
			throws Exception {
		FileOutputStream fo = new FileOutputStream(file);
		GZIPOutputStream os = new GZIPOutputStream(fo);
		byte[] buffer = new byte[1024];
		int readed = in.read(buffer);
		while (readed > -1) {
			os.write(buffer, 0, readed);
			readed = in.read(buffer);
		}
		os.flush();
		os.close();
		fo.close();
		in.close();
	}

	/**
	 * 压缩字符串
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static String gzipString(String str,String encoding) throws Exception {
		if (str == null || str.length() == 0) {
			return str;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		if(encoding==null) gzip.write(str.getBytes());
		else gzip.write(str.getBytes(encoding));
		gzip.close();
		return out.toString("ISO-8859-1");
	}
	public static String gzipBytes(byte[] bytes) throws Exception {
		if (bytes==null) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		gzip.write(bytes);
		gzip.close();
		return out.toString("ISO-8859-1");
	}

	/**
	 * 解压字符串
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static String readGzipString(String str,String encoding) throws Exception {
		if (str == null || str.length() == 0) {
			return str;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
		GZIPInputStream gunzip = new GZIPInputStream(in);
		byte[] buffer = new byte[256];
		int n;
		while ((n = gunzip.read(buffer)) >= 0) {
			out.write(buffer, 0, n);
		}
		if(encoding==null) return out.toString();
		else  return out.toString(encoding);
	}

	/**
	 * test
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		extractZipFile("F:\\tmp\\新建 文本文档2.zip", "F:\\tmp\\", null);
	}
}
