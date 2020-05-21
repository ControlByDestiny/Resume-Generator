<template>
  <div id="dashboard">
    <div>{{ $t('message')}}</div>
    <div class="button" @click="onClick">Change to English</div>
    <custome-button text="点击" @click.native="onTest"/>
    <div v-if="showTip">message is {{ message }}</div>
  </div>
</template>

<script>
import CustomeButton from '@/components/CustomeButton'
import { isEmptyObject } from '@/util/index.js'
import { mapState, mapActions } from 'vuex'

export default {
  components: {
    CustomeButton
  },
  computed: {
    ...mapState(['message']),
    showTip () {
      return !isEmptyObject(this.message)
    }
  },
  methods: {
    ...mapActions(['test']),
    onClick () {
      var currentLocale = this.$i18n.locale
      this.$i18n.locale = currentLocale === 'en' ? 'zh' : 'en'
      localStorage.setItem('locale', this.$i18n.locale)
    },
    onTest () {
      console.log('CLICK')
      this.test()
    }
  }
}
</script>

<style lang="stylus">
#dashboard
  height 100%
  display flex
  flex-direction column
  align-items center
  .button
    cursor pointer
    user-select none
    display flex
    border 1px solid #000
    padding 5px
    border-radius 8px
</style>
