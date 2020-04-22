<template>
  <div id="dashboard">
    <div>{{ $t('message')}}</div>
    <div class="button" @click="onClick">Change to English</div>
  </div>
</template>

<script>

export default {
  methods: {
    onClick () {
      var currentLocale = this.$i18n.locale
      this.$i18n.locale = currentLocale === 'en' ? 'zh' : 'en'
      localStorage.setItem('locale', this.$i18n.locale)
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
