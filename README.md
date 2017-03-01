这是一个使用assembly插件进行打包的完整程序。

打包后的运行包的目录结构：

    ./bin
    ./conf
    ./lib
 
可以运行bin下的脚本启停程序。


maven执行package生命周期

输出日志：

。。。。。。

[INFO] --- maven-assembly-plugin:2.4:single (make-assembly) @ assembly-package ---

[INFO] Building zip: D:\myIdeaProject\assembly-package\target\assembly-package-1.0-SNAPSHOT-assembly.zip

。。。。。。

将打包好的zip包 assembly-package-1.0-SNAPSHOT-assembly.zip 上传到服务器解压

unzip assembly-package-1.0-SNAPSHOT-assembly.zip -d assembly-package-1.0-SNAPSHOT-assembly

由于shell脚本实在Windows下编辑的，文件结束符与Linux系统不同。所以需要设置脚本的格式为Linux格式:

vim start.sh

:set fileformat=unix

wq


vim stop.sh

:set fileformat=unix

wq


OK！


上传到github

在github创建库https://github.com/zhouchaochao/assembly-package.git

在 D:\myIdeaProject\assembly-package执行git命令：

git init

git add README.md

git commit -m "first commit"

git remote add origin https://github.com/zhouchaochao/assembly-package.git

git push -u origin master


OK！
