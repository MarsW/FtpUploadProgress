FtpUploadProgress
=================
This project provides Ftp Upload with Progress Bar in ListView (using apache common ftp)

- Multiple Files/Folder Upload (separate with ',')
	- Files
	- 1-level Folder
- You can click "Clear" button to delete finished tasks from screen

[Code Explanation](http://tech.marsw.tw/blog/2014/03/01/android-apache-commons-ftp-upload-with-update-progress-bar-in-listview)

## Note
If you want to add this code into your android project,
remember to enable write & network in AndroidManifest.xml

```xml 
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
```