����һ��ʹ��assembly������д������������
���������а���Ŀ¼�ṹ��
    ./bin
    ./conf
    ./lib
��������bin�µĽű���ͣ����


mavenִ��package��������
�����־��
������������
[INFO] --- maven-assembly-plugin:2.4:single (make-assembly) @ assembly-package ---
[INFO] Building zip: D:\myIdeaProject\assembly-package\target\assembly-package-1.0-SNAPSHOT-assembly.zip
������������

������õ�zip�� assembly-package-1.0-SNAPSHOT-assembly.zip �ϴ���������
��ѹ
unzip assembly-package-1.0-SNAPSHOT-assembly.zip -d assembly-package-1.0-SNAPSHOT-assembly

����shell�ű�ʵ��Windows�±༭�ģ��ļ���������Linuxϵͳ��ͬ��������Ҫ���ýű��ĸ�ʽΪLinux��ʽ
vim start.sh
:set fileformat=unix
wq

vim stop.sh
:set fileformat=unix
wq

OK��

#�ϴ���github
��github������https://github.com/zhouchaochao/assembly-package.git
�� D:\myIdeaProject\assembly-packageִ��git���
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/zhouchaochao/assembly-package.git
git push -u origin master

OK��