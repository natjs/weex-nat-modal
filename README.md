# nat-modal

## Installation
```
weexpack plugin add nat-modal
```

```
npm install weex-nat --save
```

## Usage

Use in weex file (.we)

```html
<script>
import 'Nat' from 'weex-nat'

// alert
Nat.alert('Hello Nat!')

// confirm
Nat.confirm('This is a confirm dialog with callback', (err, ret) => {
    console.log((ret) ? 'confirmed' : 'canceled')
})

// prompt
Nat.prompt('This is a prompt dialog with callback', (err, ret) => {
    console.log((ret.result) ? 'prompted\n' + ret.data : 'canceled')
})

// toast
Nat.toast('Hello Nat!')

</script>
```

See the Nat [Documentation](http://natjs.com/) for more details.
