/**
 * Package JS = NPM, Yarn Package Manager
 * Standar package manager yang disediakan Node.js
 * npm help di command
 * npm install -h
 */

/**
 * Installing package
 * lokal package = 1 folder dengan project = npm install <package-name>
 * global package = bisa digunakan ke semua project = npm install -g <package-name>
 * Setelah install package, pergilah ke package.json. Disana akan ada 2 macam objek :
 * Objek dependencies merupakan objek yang menampung package yang kita gunakan untuk membuat aplikasi. 
 * objek devDependencies digunakan untuk package yang berkaitan hanya saat proses pengembangan aplikasi = npm install <package-name> --save-dev
 */

/**
 * Using package
 * Package = module 
 * Import package = import variableName from 'package-name';
 */


/**
 * Uninstall package
 * Objek dependencies = npm uninstall <package-name>
 * Objek devDependencies = npm uninstall <package-name> --save-dev
 * Alias dalam uninstall = npm uninstall -h
 */