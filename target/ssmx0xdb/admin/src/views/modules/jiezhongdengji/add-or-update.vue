<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
                        <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="接种编号" prop="jiezhongbianhao">
            <el-input v-model="ruleForm.jiezhongbianhao" 
                placeholder="接种编号" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.jiezhongbianhao" label="接种编号" prop="jiezhongbianhao">
              <el-input v-model="ruleForm.jiezhongbianhao" 
                placeholder="接种编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="儿童姓名" prop="ertongxingming">
          <el-input v-model="ruleForm.ertongxingming" 
              placeholder="儿童姓名" clearable  :readonly="ro.ertongxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="儿童姓名" prop="ertongxingming">
              <el-input v-model="ruleForm.ertongxingming" 
                placeholder="儿童姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="性别" prop="xingbie">
          <el-input v-model="ruleForm.xingbie" 
              placeholder="性别" clearable  :readonly="ro.xingbie"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="性别" prop="xingbie">
              <el-input v-model="ruleForm.xingbie" 
                placeholder="性别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling" 
              placeholder="年龄" clearable  :readonly="ro.nianling"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="年龄" prop="nianling">
              <el-input v-model="ruleForm.nianling" 
                placeholder="年龄" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="接种卡号" prop="jiezhongkahao">
          <el-input v-model="ruleForm.jiezhongkahao" 
              placeholder="接种卡号" clearable  :readonly="ro.jiezhongkahao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="接种卡号" prop="jiezhongkahao">
              <el-input v-model="ruleForm.jiezhongkahao" 
                placeholder="接种卡号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="出生日期" prop="chushengriqi">
          <el-input v-model="ruleForm.chushengriqi" 
              placeholder="出生日期" clearable  :readonly="ro.chushengriqi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="出生日期" prop="chushengriqi">
              <el-input v-model="ruleForm.chushengriqi" 
                placeholder="出生日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="身份证号" prop="shenfenzhenghao">
          <el-input v-model="ruleForm.shenfenzhenghao" 
              placeholder="身份证号" clearable  :readonly="ro.shenfenzhenghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="身份证号" prop="shenfenzhenghao">
              <el-input v-model="ruleForm.shenfenzhenghao" 
                placeholder="身份证号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="监护人姓名" prop="jianhurenxingming">
          <el-input v-model="ruleForm.jianhurenxingming" 
              placeholder="监护人姓名" clearable  :readonly="ro.jianhurenxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="监护人姓名" prop="jianhurenxingming">
              <el-input v-model="ruleForm.jianhurenxingming" 
                placeholder="监护人姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
          <el-input v-model="ruleForm.yonghuzhanghao" 
              placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户账号" prop="yonghuzhanghao">
              <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="家长电话" prop="yonghushouji">
          <el-input v-model="ruleForm.yonghushouji" 
              placeholder="家长电话" clearable  :readonly="ro.yonghushouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="家长电话" prop="yonghushouji">
              <el-input v-model="ruleForm.yonghushouji" 
                placeholder="家长电话" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="接种日期" prop="jiezhongriqi">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.jiezhongriqi" 
                type="datetime"
                placeholder="接种日期">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.jiezhongriqi" label="接种日期" prop="jiezhongriqi">
              <el-input v-model="ruleForm.jiezhongriqi" 
                placeholder="接种日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="疫苗名称" prop="yimiaomingcheng">
          <el-select v-model="ruleForm.yimiaomingcheng" placeholder="请选择疫苗名称">
            <el-option
                v-for="(item,index) in yimiaomingchengOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="疫苗名称" prop="yimiaomingcheng">
	      <el-input v-model="ruleForm.yimiaomingcheng"
                placeholder="疫苗名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="接种次数" prop="jiezhongcishu">
          <el-input v-model="ruleForm.jiezhongcishu" 
              placeholder="接种次数" clearable  :readonly="ro.jiezhongcishu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="接种次数" prop="jiezhongcishu">
              <el-input v-model="ruleForm.jiezhongcishu" 
                placeholder="接种次数" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="接种历史" prop="jiezhonglishi">
          <el-input v-model="ruleForm.jiezhonglishi" 
              placeholder="接种历史" clearable  :readonly="ro.jiezhonglishi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="接种历史" prop="jiezhonglishi">
              <el-input v-model="ruleForm.jiezhonglishi" 
                placeholder="接种历史" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="下次接种时间" prop="xiacijiezhongshijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.xiacijiezhongshijian" 
                type="date"
                placeholder="下次接种时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.xiacijiezhongshijian" label="下次接种时间" prop="xiacijiezhongshijian">
              <el-input v-model="ruleForm.xiacijiezhongshijian" 
                placeholder="下次接种时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="医护工号" prop="yihugonghao">
          <el-input v-model="ruleForm.yihugonghao" 
              placeholder="医护工号" clearable  :readonly="ro.yihugonghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="医护工号" prop="yihugonghao">
              <el-input v-model="ruleForm.yihugonghao" 
                placeholder="医护工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="医护姓名" prop="yihuxingming">
          <el-input v-model="ruleForm.yihuxingming" 
              placeholder="医护姓名" clearable  :readonly="ro.yihuxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="医护姓名" prop="yihuxingming">
              <el-input v-model="ruleForm.yihuxingming" 
                placeholder="医护姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                              </el-row>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"#fff","dateIconFontSize":"14px","btnSaveBgColor":"rgba(252, 201, 51, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"rgba(220, 223, 230, 1)","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(81, 81, 81, 1)","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"0px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"#409EFF","btnSaveBorderWidth":"0px"},
      id: '',
      type: '',
      ro:{
	jiezhongbianhao : false,
	ertongxingming : false,
	xingbie : false,
	nianling : false,
	jiezhongkahao : false,
	chushengriqi : false,
	shenfenzhenghao : false,
	jianhurenxingming : false,
	yonghuzhanghao : false,
	yonghushouji : false,
	jiezhongriqi : false,
	yimiaomingcheng : false,
	jiezhongcishu : false,
	jiezhonglishi : false,
	xiacijiezhongshijian : false,
	yihugonghao : false,
	yihuxingming : false,
      },
            ruleForm: {
                        jiezhongbianhao: this.getUUID(),
                        	        ertongxingming: '',
	                        	        xingbie: '',
	                        	        nianling: '',
	                        	        jiezhongkahao: '',
	                        	        chushengriqi: '',
	                        	        shenfenzhenghao: '',
	                        	        jianhurenxingming: '',
	                        	        yonghuzhanghao: '',
	                        	        yonghushouji: '',
	                        	        jiezhongriqi: '',
	                        	        yimiaomingcheng: '',
	                        	        jiezhongcishu: '',
	                        	        jiezhonglishi: '',
	                        	        xiacijiezhongshijian: '',
	                        	        yihugonghao: '',
	                        	        yihuxingming: '',
	                      },
                                                                                                                                                                                  yimiaomingchengOptions: [],
                                                                                          rules: {
                  jiezhongbianhao: [
                                    	                                                              ],
                  ertongxingming: [
                                    	                                                              ],
                  xingbie: [
                                    	                                                              ],
                  nianling: [
                                    	                                                              ],
                  jiezhongkahao: [
                                    	                                                              ],
                  chushengriqi: [
                                    	                                                              ],
                  shenfenzhenghao: [
                                    	                                                              ],
                  jianhurenxingming: [
                                    	                                                              ],
                  yonghuzhanghao: [
                                    	                                                              ],
                  yonghushouji: [
                                    	                                                              ],
                  jiezhongriqi: [
                                    	                                                              ],
                  yimiaomingcheng: [
                                    	                                                              ],
                  jiezhongcishu: [
                                    	                                                              ],
                  jiezhonglishi: [
                                    	                                                              ],
                  xiacijiezhongshijian: [
                                    	                                                              ],
                  yihugonghao: [
                                    	                                                              ],
                  yihuxingming: [
                                    	                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                                                                                                                                                  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          	            if(o=='jiezhongbianhao'){
            this.ruleForm.jiezhongbianhao = obj[o];
	    this.ro.jiezhongbianhao = true;
            continue;
          }
	            	            if(o=='ertongxingming'){
            this.ruleForm.ertongxingming = obj[o];
	    this.ro.ertongxingming = true;
            continue;
          }
	            	            if(o=='xingbie'){
            this.ruleForm.xingbie = obj[o];
	    this.ro.xingbie = true;
            continue;
          }
	            	            if(o=='nianling'){
            this.ruleForm.nianling = obj[o];
	    this.ro.nianling = true;
            continue;
          }
	            	            if(o=='jiezhongkahao'){
            this.ruleForm.jiezhongkahao = obj[o];
	    this.ro.jiezhongkahao = true;
            continue;
          }
	            	            if(o=='chushengriqi'){
            this.ruleForm.chushengriqi = obj[o];
	    this.ro.chushengriqi = true;
            continue;
          }
	            	            if(o=='shenfenzhenghao'){
            this.ruleForm.shenfenzhenghao = obj[o];
	    this.ro.shenfenzhenghao = true;
            continue;
          }
	            	            if(o=='jianhurenxingming'){
            this.ruleForm.jianhurenxingming = obj[o];
	    this.ro.jianhurenxingming = true;
            continue;
          }
	            	            if(o=='yonghuzhanghao'){
            this.ruleForm.yonghuzhanghao = obj[o];
	    this.ro.yonghuzhanghao = true;
            continue;
          }
	            	            if(o=='yonghushouji'){
            this.ruleForm.yonghushouji = obj[o];
	    this.ro.yonghushouji = true;
            continue;
          }
	            	            if(o=='jiezhongriqi'){
            this.ruleForm.jiezhongriqi = obj[o];
	    this.ro.jiezhongriqi = true;
            continue;
          }
	            	            if(o=='yimiaomingcheng'){
            this.ruleForm.yimiaomingcheng = obj[o];
	    this.ro.yimiaomingcheng = true;
            continue;
          }
	            	            if(o=='jiezhongcishu'){
            this.ruleForm.jiezhongcishu = obj[o];
	    this.ro.jiezhongcishu = true;
            continue;
          }
	            	            if(o=='jiezhonglishi'){
            this.ruleForm.jiezhonglishi = obj[o];
	    this.ro.jiezhonglishi = true;
            continue;
          }
	            	            if(o=='xiacijiezhongshijian'){
            this.ruleForm.xiacijiezhongshijian = obj[o];
	    this.ro.xiacijiezhongshijian = true;
            continue;
          }
	            	            if(o=='yihugonghao'){
            this.ruleForm.yihugonghao = obj[o];
	    this.ro.yihugonghao = true;
            continue;
          }
	            	            if(o=='yihuxingming'){
            this.ruleForm.yihuxingming = obj[o];
	    this.ro.yihuxingming = true;
            continue;
          }
	                    }
                                                                                                                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                  		if(json.xingbie!=''&&json.xingbie){
              		this.ruleForm.xingbie = json.xingbie
		}
                                  		if(json.nianling!=''&&json.nianling){
              		this.ruleForm.nianling = json.nianling
		}
                                                                                                                                                                                                                                                                                    		if(json.yihugonghao!=''&&json.yihugonghao){
              		this.ruleForm.yihugonghao = json.yihugonghao
		}
                                  		if(json.yihuxingming!=''&&json.yihuxingming){
              		this.ruleForm.yihuxingming = json.yihuxingming
		}
                              } else {
          this.$message.error(data.msg);
        }
      });
                                                                                                                                                                                                                                                this.$http({
              url: `option/yimiaoxinxi/yimiaomingcheng`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.yimiaomingchengOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
         
                                                                                                                      },
                                                                                                                                                // 多级联动参数
                                                                                                                                                                                      info(id) {
      this.$http({
        url: `jiezhongdengji/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                                                                                                                                                                                                      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `jiezhongdengji/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.jiezhongdengjiCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.jiezhongdengjiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
                                                                                                                                                                                                                	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
