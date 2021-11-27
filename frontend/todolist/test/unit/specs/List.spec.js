import List from '@/components/List'
import { mount } from 'avoriaz'
import Vue from 'vue'

describe('List.vue', () => {
  it('Listenin elemanları gösterme', () => {
    const Constructor = Vue.extend(List)
    const ListComponent = new Constructor().$mount()
    expect(ListComponent.$el.textContent).to.contain('')
  })

  it('Butona basıldığında yeni bir eleman listeye eklenme', () => {
    // build component
    const Constructor = Vue.extend(List)
    const ListComponent = new Constructor().$mount()

    // set input value
    ListComponent.newItem = 'Kitap okuma'

    // simulate click event
    const button = ListComponent.$el.querySelector('button')
    const clickEvent = new window.Event('click')
    button.dispatchEvent(clickEvent)
    ListComponent._watcher.run()

    // assert list contains new item
    expect(ListComponent.$el.textContent).to.contain('Kitap okuma')
    expect(ListComponent.listItems).to.contain('Kitap okuma')
  })
})
