# JavaScript plugin for Intellij Idea

This plugin support javascript language for Intellij Idea Community edition

## How to use it
There is no release version of this plugin, so if you want to use it, us must compile this plugin in Intellij Idea


## How to build plugin

### Pre request
* add Grammar-kit plugin from plugin Marketplace
* set Intellij Idea plugin sdk in project settings

### Build
* open js.bnf file (stable version) or js_beta.bnf (beta version)
* right mouse button click and choose option: Generate Parser Code or use shortcut (on windows ctrl+shift+G)
* right mouse button click again and choose: Generate JFlex Lexer
* right click on JSLexer.flex file and choose option: Run JFlex generator
  * before Run JFlex generator check JSLexer.flex 
  * some version of JFlex add prefix: "_" to lexer class like this _JSLexer
  * remove "_" prefix before run jflex
* run application