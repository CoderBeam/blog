(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-23240c6e"],{"4bbc":function(t,a,n){},bb32:function(t,a,n){"use strict";var e=n("4bbc"),o=n.n(e);o.a},ef4c:function(t,a,n){"use strict";n.r(a);var e=function(){var t=this,a=t.$createElement,n=t._self._c||a;return n("div",[n("div",{staticClass:"banner",style:t.cover},[n("h1",{staticClass:"banner-title"},[t._v("关于我")])]),n("v-card",{staticClass:"blog-container"},[n("div",{staticClass:"my-wrapper"},[n("v-avatar",{attrs:{size:"110"}},[n("img",{staticClass:"author-avatar",attrs:{src:t.avatar}})])],1),n("div",{staticClass:"about-content markdown-body",domProps:{innerHTML:t._s(t.aboutContent)}})])],1)},o=[],r=(n("4160"),n("159b"),{created:function(){this.getAboutContent()},data:function(){return{aboutContent:""}},methods:{getAboutContent:function(){var t=this;this.axios.get("/api/about").then((function(a){var e=a.data,o=n("d4cd"),r=new o;t.aboutContent=r.render(e.data)}))}},computed:{avatar:function(){return this.$store.state.blogInfo.websiteConfig.websiteAvatar},cover:function(){var t="";return this.$store.state.blogInfo.pageList.forEach((function(a){"about"==a.pageLabel&&(t=a.pageCover)})),"background: url("+t+") center center / cover no-repeat"}}}),s=r,c=(n("bb32"),n("2877")),i=n("6544"),u=n.n(i),b=n("8212"),v=n("b0af"),d=Object(c["a"])(s,e,o,!1,null,"98c74a00",null);a["default"]=d.exports;u()(d,{VAvatar:b["a"],VCard:v["a"]})}}]);