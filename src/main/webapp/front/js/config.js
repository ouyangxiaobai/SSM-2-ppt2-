
var projectName = '儿童接种系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '公告信息',
	url: './pages/gonggaoxinxi/list.html'
}, 
{
	name: '疫苗知识',
	url: './pages/yimiaozhishi/list.html'
}, 
{
	name: '接种项目',
	url: './pages/jiezhongxiangmu/list.html'
}, 

{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmx0xdb/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","安排接种项目"],"menu":"医护人员","menuJump":"列表","tableName":"yihurenyuan"}],"menu":"医护人员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","入库","出库"],"menu":"疫苗信息","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"疫苗入库","menuJump":"列表","tableName":"yimiaoruku"}],"menu":"疫苗入库管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"疫苗出库","menuJump":"列表","tableName":"yimiaochuku"}],"menu":"疫苗出库管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"疫苗知识","menuJump":"列表","tableName":"yimiaozhishi"}],"menu":"疫苗知识管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"接种项目","menuJump":"列表","tableName":"jiezhongxiangmu"}],"menu":"接种项目管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"预约接种","menuJump":"列表","tableName":"yuyuejiezhong"}],"menu":"预约接种管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"接种登记","menuJump":"列表","tableName":"jiezhongdengji"}],"menu":"接种登记管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"接种异常","menuJump":"列表","tableName":"jiezhongyichang"}],"menu":"接种异常管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"},{"child":[{"buttons":["查看"],"menu":"疫苗知识列表","menuJump":"列表","tableName":"yimiaozhishi"}],"menu":"疫苗知识模块"},{"child":[{"buttons":["查看","预约接种"],"menu":"接种项目列表","menuJump":"列表","tableName":"jiezhongxiangmu"}],"menu":"接种项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"接种项目","menuJump":"列表","tableName":"jiezhongxiangmu"}],"menu":"接种项目管理"},{"child":[{"buttons":["查看","接种登记"],"menu":"预约接种","menuJump":"列表","tableName":"yuyuejiezhong"}],"menu":"预约接种管理"},{"child":[{"buttons":["查看","修改","删除","异常登记"],"menu":"接种登记","menuJump":"列表","tableName":"jiezhongdengji"}],"menu":"接种登记管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"接种异常","menuJump":"列表","tableName":"jiezhongyichang"}],"menu":"接种异常管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"},{"child":[{"buttons":["查看"],"menu":"疫苗知识列表","menuJump":"列表","tableName":"yimiaozhishi"}],"menu":"疫苗知识模块"},{"child":[{"buttons":["查看","预约接种"],"menu":"接种项目列表","menuJump":"列表","tableName":"jiezhongxiangmu"}],"menu":"接种项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"医护人员","tableName":"yihurenyuan"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"预约接种","menuJump":"列表","tableName":"yuyuejiezhong"}],"menu":"预约接种管理"},{"child":[{"buttons":["查看"],"menu":"接种登记","menuJump":"列表","tableName":"jiezhongdengji"}],"menu":"接种登记管理"},{"child":[{"buttons":["查看"],"menu":"接种异常","menuJump":"列表","tableName":"jiezhongyichang"}],"menu":"接种异常管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"},{"child":[{"buttons":["查看"],"menu":"疫苗知识列表","menuJump":"列表","tableName":"yimiaozhishi"}],"menu":"疫苗知识模块"},{"child":[{"buttons":["查看","预约接种"],"menu":"接种项目列表","menuJump":"列表","tableName":"jiezhongxiangmu"}],"menu":"接种项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
