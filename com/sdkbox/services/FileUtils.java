package com.sdkbox.services;

import android.content.res.AssetManager;
import com.sdkbox.plugin.SDKBox;
import com.sdkbox.plugin.SdkboxLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import jeb.synthetic.TWR;

public class FileUtils {
    static enum Storage {
        ASSETS,
        INTERNAL,
        EXTERNAL;

    }

    private static boolean __existsFileAssets(String path) {
        InputStream in;
        AssetManager assetManager0 = SDKBox.getContext().getAssets();
        try {
            in = assetManager0.open(path);
        }
        catch(Exception unused_ex) {
            return false;
        }
        if(in != null) {
            try {
                in.close();
            }
            catch(Exception unused_ex) {
            }
            return true;
        }
        return true;
    }

    private static boolean __existsFileInternal(String path) {
        FileInputStream fin;
        try {
            fin = SDKBox.getContext().openFileInput(path);
        }
        catch(FileNotFoundException unused_ex) {
            SdkboxLog.d("SDKBOXFileUtils", "    File : " + path + " " + "does not exist." + " in private storage. " + false, new Object[0]);
            return false;
        }
        catch(Throwable throwable0) {
            SdkboxLog.d("SDKBOXFileUtils", "    File : " + path + " " + "exists" + " in private storage. " + true, new Object[0]);
            throw throwable0;
        }
        if(fin != null) {
            try {
                fin.close();
            }
            catch(Exception unused_ex) {
            }
        }
        SdkboxLog.d("SDKBOXFileUtils", "    File : " + path + " " + "exists" + " in private storage. " + true, new Object[0]);
        return true;
    }

    public static byte[] __readContentsAtPathAssets(String path) {
        BufferedInputStream bis;
        AssetManager assetManager0 = SDKBox.getContext().getAssets();
        BufferedInputStream bis = null;
        byte[] ret = null;
        try {
            bis = new BufferedInputStream(assetManager0.open(path));
        }
        catch(Exception unused_ex) {
            goto label_19;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(0x2000);
            int v;
            while((v = bis.available()) > 0) {
                ret = new byte[v];
                bis.read(ret);
                baos.write(ret);
            }
            ret = baos.toByteArray();
        }
        catch(Exception unused_ex) {
            bis = bis;
        label_19:
            if(bis != null) {
                try {
                    bis.close();
                }
                catch(Exception unused_ex) {
                }
                return ret;
            }
            return ret;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(bis, throwable0);
            throw throwable0;
        }
        try {
            bis.close();
        }
        catch(Exception unused_ex) {
        }
        return ret;
    }

    public static byte[] __readContentsAtPathInternal(String path) {
        byte[] ret;
        FileInputStream fout = null;
        try {
            fout = SDKBox.getContext().openFileInput(path);
            ByteArrayOutputStream baos = new ByteArrayOutputStream(0x2000);
            int v;
            while((v = fout.available()) > 0) {
                byte[] ret = new byte[v];
                fout.read(ret);
                baos.write(ret);
            }
            ret = baos.toByteArray();
        }
        catch(Exception unused_ex) {
            if(fout != null) {
                try {
                    fout.close();
                }
                catch(Exception unused_ex) {
                }
                return null;
            }
            return null;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(fout, throwable0);
            throw throwable0;
        }
        try {
            fout.close();
        }
        catch(Exception unused_ex) {
        }
        return ret;
    }

    public static boolean deleteFileAtPath(String path, int storage) {
        return Storage.values()[storage] == Storage.INTERNAL ? SDKBox.getContext().deleteFile(path) : false;
    }

    public static boolean existsDirectory(String dir_path, int storage) {
        return com.sdkbox.services.FileUtils.1.$SwitchMap$com$sdkbox$services$FileUtils$Storage[Storage.values()[storage].ordinal()] == 1 ? SDKBox.getContext().getDir(dir_path, 0) != null : false;
    }

    public static boolean existsFile(String path, int storage) {
        switch(Storage.values()[storage]) {
            case INTERNAL: {
                return FileUtils.__existsFileInternal(path);
            }
            case ASSETS: {
                return FileUtils.__existsFileAssets(path);
            }
            default: {
                return false;
            }
        }
    }

    public static FileInputStream getFileInputAtInternalFolderPath(String path) {
        try {
            return SDKBox.getContext().openFileInput(path);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static FileOutputStream getFileOutputAtInternalFolderPath(String path) {
        try {
            return SDKBox.getContext().openFileOutput(path, 0);
        }
        catch(Exception x) {
            x.printStackTrace();
            return null;
        }
    }

    public static Reader getReaderAtInternalFolderPath(String path) {
        FileInputStream fileInputStream0 = FileUtils.getFileInputAtInternalFolderPath(path);
        if(fileInputStream0 != null) {
            try {
                return new FileReader(fileInputStream0.getFD());
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        return null;
    }

    public static Writer getWriterAtInternalFolderPath(String path) {
        FileOutputStream fileOutputStream0 = FileUtils.getFileOutputAtInternalFolderPath(path);
        if(fileOutputStream0 != null) {
            try {
                return new FileWriter(fileOutputStream0.getFD());
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        return null;
    }

    public static byte[] readFileContentsAtPath(String path, int storage) {
        switch(Storage.values()[storage]) {
            case INTERNAL: {
                return FileUtils.__readContentsAtPathInternal(path);
            }
            case ASSETS: {
                return FileUtils.__readContentsAtPathAssets(path);
            }
            default: {
                return null;
            }
        }
    }

    public static boolean writeFileContentsAtPath(byte[] data, String path, int storage) {
        FileOutputStream fout;
        if(Storage.values()[storage] == Storage.INTERNAL) {
            try {
                try {
                    fout = null;
                    fout = SDKBox.getContext().openFileOutput(path, 0);
                    fout.write(data);
                    goto label_14;
                }
                catch(Exception x) {
                }
                SdkboxLog.d("SDKBOXFileUtils", "Error creating internal file:" + path + ". reason:" + x.getMessage(), new Object[0]);
                if(fout != null) {
                    goto label_8;
                }
                return false;
            }
            catch(Throwable throwable0) {
                goto label_12;
            }
            try {
            label_8:
                fout.close();
            }
            catch(Exception unused_ex) {
            }
            return false;
        label_12:
            TWR.safeClose$NT(fout, throwable0);
            throw throwable0;
            try {
            label_14:
                fout.close();
            }
            catch(Exception unused_ex) {
            }
            return true;
        }
        return false;
    }
}

