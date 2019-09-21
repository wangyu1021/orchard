<template>
    <div class="enterprise flex">
        <div class="left-label">
            <div class="info_head ">在线留言</div>
            <div class="info_content">
                <div class="label_content">
                    <h1>
                        <a>
                            <span>服务流程</span>
                        </a>
                    </h1>
                    <h1>
                        <a>
                            <span>企业文化</span>
                        </a>
                    </h1>
                    <h1>
                        <a>
                            <span>联系我们</span>
                        </a>
                    </h1>
                    <h1>
                        <a>
                            <span>公司简介</span>
                        </a>
                    </h1>
                </div>
            </div>
            <connect-us/>
        </div>
        <div class="right-label">
            <div class="label_head">
                <div class="label_title">服务流程</div>
            </div>
            <div class="link_more">
                <!--<form action="" method="post">
                            <label for="user">*姓名:</label>
                            <input type="text" id=user name="user" value="" /><br />
                            <label for="email">*电话:</label>
                            <input type="text" id=number name="number" value="" /><br />
                            <label for="email">*邮件:</label>
                            <input type="text" id=email name="email" value="" /><br />
                            <label  class="" for="comment">*资讯内容:</label>
                            <textarea id=comment name="comment">
                            </textarea><br />
                            <input class="sub" type="submit" name="提交" /><br />
                        </form>-->
                <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                    <el-form-item label="姓名" prop="name">
                        <el-input v-model="ruleForm.name"></el-input>
                    </el-form-item>
                    <el-form-item label="电话" prop="phone">
                        <el-input v-model="ruleForm.phone"></el-input>
                    </el-form-item>
                    <el-form-item label="Email" prop="email">
                        <el-input v-model="ruleForm.email"></el-input>
                    </el-form-item>
                    <el-form-item label="咨询内容" prop="consult">
                        <el-input type="textarea" :rows="8" v-model="ruleForm.consult"></el-input>
                        <p class="grey">请填写您要咨询的信息</p>
                    </el-form-item>
                    <el-form-item>
                        <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
                    </el-form-item>
                </el-form>
            </div>
        </div>
    </div>
</template>

<script>
import connectUs from '../components/connectUs'
export default {
    data() {
        return {
            ruleForm: {
                name: '',
                phone: '',
                email: '',
                consult: ''
            },
            rules: {
                name: [
                    { required: true, message: '请输入姓名', trigger: 'blur' },
                ],
                phone: [
                    { required: true, message: '请输入电话', trigger: 'blur' },
                ],
                email: [
                    { required: true, message: '请输入Email', trigger: 'blur' },
                ],
                consult: [
                    { required: true, message: '请填写活动形式', trigger: 'blur' }
                ]
            }

        };
    },
    components: {
        connectUs
    },
    methods: {
        submitForm(formName) {
            this.$refs[formName].validate((valid) => {
                if (valid) {
                    alert('submit!');
                } else {
                    console.log('error submit!!');
                    return false;
                }
            });
        },
    },
}
</script >
<style  scoped>
.left-label {
    width: 250px;
}

.enterprise {
    width: 1000px;
    margin: auto;
}

.label_content h1 {
    font-size: 12px;
    height: 25px;
    line-height: 25px;
    padding-left: 25px;
    background: url(../assets/img/article_arrow_1.jpg) no-repeat;
    background-position: 10px 10px;
}

.right-label {
    margin: 0 0 0 20px;
}

.link_more {
    text-align: left;
    line-height: 24px;
    width: 730px;
    letter-spacing: 2px;
}
.demo-ruleForm .el-input{
    width: 300px;
}
.demo-ruleForm .el-textarea{
width: 400px;
}
</style>