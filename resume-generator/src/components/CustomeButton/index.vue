<template>
  <div id="custome-button">
    <Button type="primary">{{ text }}</Button>
  </div>
</template>

<script>
export default {
  props: {
    text: String
  }
}
</script>

<style lang="stylus">
#custome-button
  text-align center
  cursor pointer

</style>
