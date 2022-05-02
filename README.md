# JavaScript plugin for Intellij Idea

This plugin support javascript language for Intellij Idea Community edition

## How to use it
There is no release version of this plugin, so if you want to use it, us must compile this plugin in Intellij Idea


## How to build plugin

### Pre request
* add Grammar-kit plugin from plugin Marketplace
* set Intellij Idea plugin sdk in project settings

### Build
* rebuild Lexer
  * if something change in js.bnf file right click on it and click: Generate JFlex Lexer
  * right click on JSLexer.flex file and click option: Run JFlex generator
* run application